import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class vinci {
    public static void main(String[] args) {
        String filePath = "./test.vinci";
        String outputFilePath = "E://Mk//ViteTemp//public//vinci.json";
        try (FileInputStream fis = new FileInputStream(filePath)) {

            // Read and calculate compressed_head_len
            long compressedHeadLen = readLong(fis);
            System.out.println("compressed_head_len: " + compressedHeadLen);

            // Read and calculate head_len
            long headLen = readLong(fis);
            System.out.println("head_len: " + headLen);

            // Read and calculate compressed_data_len
            long compressedDataLen = readLong(fis);
            System.out.println("compressed_data_len: " + compressedDataLen);

            // Read and calculate data_len
            long dataLen = readLong(fis);
            System.out.println("data_len: " + dataLen);

            byte[] compressedHead = new byte[(int) compressedHeadLen];
            byte[] compressedData = new byte[(int) compressedDataLen];

            fis.read(compressedHead);
            fis.read(compressedData);

            // Decompress data
            byte[] decompressedData = decompress(compressedData, dataLen);

            // Convert decompressed data to JSON object
            JSONObject jsonObject = new JSONObject(new String(decompressedData, StandardCharsets.UTF_8));

            // Remove leading slash from field names
            JSONObject cleanJsonObject = removeLeadingSlash(jsonObject);
            String[] jsonObj = { "upper", "lower" };
            for (String obj : jsonObj) {
//                JSONObject border = cleanJsonObject.getJSONObject("modelMC").getJSONObject(obj).getJSONObject("GumLine").getJSONObject("allBorders").keySet();
                System.out.println("cleanJsonObject: " + cleanJsonObject.getJSONObject("modelMC").getJSONObject(obj).getJSONObject("GumLine").getJSONObject("allBorders").keySet());
            }
            // 遍历 JsonObject 的键值对并打印
            // 遍历JSONObject的键
            // Write JSON data to file
            try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
                fos.write(cleanJsonObject.toString(2).getBytes(StandardCharsets.UTF_8));
            }

            System.out.println("Decompressed data has been written to " + outputFilePath);

        } catch (IOException | DataFormatException e) {
            e.printStackTrace();
        }
    }

    private static long readLong(FileInputStream fis) throws IOException {
        byte[] bytes = new byte[4];
        if (fis.read(bytes) != 4) {
            throw new IOException("Unable to read 4 bytes for a long value.");
        }
        return getLongFromBytes(bytes);
    }

    private static long getLongFromBytes(byte[] bytes) {
        long value = 0;
        for (int i = bytes.length - 1; i >= 0; i--) {
            value <<= 8;
            value |= (bytes[i] & 0xFF);
        }
        return value;
    }

    private static byte[] decompress(byte[] data, long originalSize) throws DataFormatException, IOException {
        Inflater inflater = new Inflater();
        inflater.setInput(data);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];

        try {
            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
        } finally {
            inflater.end();
        }

        return outputStream.toByteArray();
    }

    private static JSONObject removeLeadingSlash(JSONObject jsonObject) {
        JSONObject cleanJsonObject = new JSONObject();
        for (String key : jsonObject.keySet()) {
            String cleanedKey = key.startsWith("/") ? key.substring(1) : key;
            Object value = jsonObject.get(key);
            if (value instanceof JSONObject) {
                // 递归处理嵌套的JSONObject
                cleanJsonObject.put(cleanedKey, removeLeadingSlash((JSONObject) value));
            } else if (value instanceof JSONArray) {
                // 递归处理嵌套的JSONArray
                cleanJsonObject.put(cleanedKey, processArray((JSONArray) value));
            } else {
                cleanJsonObject.put(cleanedKey, value);
            }
        }
        return cleanJsonObject;
    }

    private static JSONArray processArray(JSONArray array) {
        JSONArray cleanArray = new JSONArray();
        for (Object item : array) {
            if (item instanceof JSONObject) {
                cleanArray.put(removeLeadingSlash((JSONObject) item));
            } else if (item instanceof JSONArray) {
                cleanArray.put(processArray((JSONArray) item));
            } else {
                cleanArray.put(item);
            }
        }
        return cleanArray;
    }
}
