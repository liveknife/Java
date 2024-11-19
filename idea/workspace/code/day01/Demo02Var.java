package day01;

public class Demo02Var {
    public static void main(String[] args) {
        String a = "standard";
        System.out.println(a);
        /*
        *   转义字符
        *   \n 换行
        *   \t 制表符 tab键
        *   String 表示一个路径
        *   E:\01_java_se_video\code  转义前
        *   E:\\01_java_se_video\\code 转义后
        *   float: 表示小数最多为7为 7.0000001
        *   double: 表示小数位为16位 3.3333333333333333
        *   开发中不使用 float 和 double 浮点型的数值参与运算 会有精度丢失的问题
        * */

        // 精度丢失
        int b = (int) 10.9;
        System.out.println(b); // 10 强制小数转为整数 会丢失小数点后的数据
        // 数据溢出 10000000000 数字太大 溢出
        int j = (int) 10000000000L;
        /*
        * 10000000000 100亿 转为二进制 10 0101 0100 0000 1011 1110 0100 0000 0000 int容纳二进制位数为32位 而100亿的二进制是34位
        * 将34位的数据强制转为32位的int 会丢失前两位 0101 0100 0000 1011 1110 0100 0000 0000 -> 1410065408 0可以忽略 101 0100 0000 1011 1110 0100 0000 0000 -> 1410065408
        * */
        System.out.println(j); // 数据丢失了 1410065408

        // byte d = (byte) 200;
        // System.out.println(d);
        byte d = (byte) 129;
        System.out.println(d); // -127

        int r = 2 << 3; // 2 * (2 * 2 * 2) | 2 * 2的三次方 -> 2 * 8
        System.out.println(r);  //
    }
}
