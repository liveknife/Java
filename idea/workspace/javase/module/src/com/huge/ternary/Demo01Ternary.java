package com.huge.ternary;

public class Demo01Ternary {
    public static void main(String[] args) {
        // 1、 小明考了 80
        int i = 60; // 及格线
        int j = 70; // 小明成绩
        String s = i > j ? "不及格" : "及格";
        System.out.println(s);

        // 2、a = 70 b = 80
        int a = 70;
        int b = 80;
        int c = a > b ? a : b;
        System.out.println(c);

        // 3、m = 70 g = 80 l = 60
        int m = 70;
        int g = 80;
        int l = 60;
        int max = m > g ? m > l ? m : l : g;
        System.out.println(max);
    }
}
