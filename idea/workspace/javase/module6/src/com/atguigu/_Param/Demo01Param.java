package com.atguigu._Param;

public class Demo01Param {
    public static void main(String[] args) {
        int a = 10, b = 20;
        method(a, b);
    }
    public static void method(int a, int b) {
        a += 10;
        b += 20;
        System.out.println(a);
        System.out.println(b);
    }
}
