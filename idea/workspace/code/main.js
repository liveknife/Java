const fs = require('fs');
const zlib = require('zlib');

const filePath = './test.vinci';
const outputFilePath = 'E://Mk//ViteTemp//public//main.json';

function readInt32LE(buffer, offset) {
    return buffer[offset] | (buffer[offset + 1] << 8) | (buffer[offset + 2] << 16) | (buffer[offset + 3] << 24);
}

fs.readFile(filePath, (err, data) => {
    if (err) {
        console.error('Error reading file:', err);
        return;
    }
    // Read compressed_head_len
    const compressed_head_len = readInt32LE(data, 0);
    console.log('compressed_head_len:', compressed_head_len);

    // Read head_len
    const head_len = readInt32LE(data, 4);
    console.log('head_len:', head_len);

    // Read compressed_data_len
    const compressed_data_len = readInt32LE(data, 8);
    console.log('compressed_data_len:', compressed_data_len);

    // Read data_len
    const data_len = readInt32LE(data, 12);
    console.log('data_len:', data_len);

    const compressed_head = data.slice(16, 16 + compressed_head_len);
    const compressed_data = data.slice(16 + compressed_head_len, 16 + compressed_head_len + compressed_data_len);

    // Decompress data
    zlib.inflate(compressed_data, (err, decompressedData) => {
        if (err) {
            console.error('Error decompressing data:', err);
            return;
        }

        const jsonString = decompressedData.slice(0, data_len).toString('utf8');
        const jsonObject = JSON.parse(jsonString);

        // Remove leading slashes from keys
        const cleanJsonObject = removeLeadingSlash(jsonObject);

        // Write JSON data to file
        fs.writeFile(outputFilePath, JSON.stringify(cleanJsonObject, null, 2), (err) => {
            if (err) {
                console.error('Error writing JSON to file:', err);
                return;
            }
            console.log(`Decompressed data has been written to ${outputFilePath}`);
        });
    });
});

function removeLeadingSlash(obj) {
    if (typeof obj !== 'object' || obj === null) {
        return obj;
    }
    if (Array.isArray(obj)) {
        return obj.map(item => removeLeadingSlash(item));
    }
    const cleanObj = {};
    for (let key in obj) {
        const newKey = key.startsWith('/') ? key.substring(1) : key;
        cleanObj[newKey] = removeLeadingSlash(obj[key]);
    }
    return cleanObj;
}
