package com.atguigu._method;

import java.util.Scanner;

public class Demo02Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = isTwoNumber(a);
        System.out.println(s);
        int n = reduce();
        System.out.println(n);

        printF(5);
    }
    public static String isTwoNumber(int a) {
        return a % 2 == 0 ? "偶数" : "奇数";
    }

    public static int reduce() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }
    public static void printF(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("我是一个有经验的JAVA开发工程师");
        }
    }
}
