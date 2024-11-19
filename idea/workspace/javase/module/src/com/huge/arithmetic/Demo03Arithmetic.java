package com.huge.arithmetic;

public class Demo03Arithmetic {
    public static void main(String[] args) {
        int i = 20;
        i /= 3; // 取整 i = i / 3 -> 6
        System.out.println(i); // 6 -> 20 / 3 (得 6)

        int j = 20;
        j %= 3; // 取余 j = j % 3 -> 2
        System.out.println(j); // 2 -> 20 / 3 (得 6 余 2)

        // 注意:byte short 遇到复合赋值运算符,jvm会自动转型
        byte b = 10;
        // b = (byte) (b + 1); // byte类型得变量参与运算会强制提升为 int 这里会报错 需要手动转换
        b += 1; // b += 1 不能百分百看成 -> b = b + 1
        System.out.println(b);
    }
}