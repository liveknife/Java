package com.atguigu._array;

import java.util.Scanner;

public class Demo03Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            int data = sc.nextInt();
            a[i] = data;
        }
    }
}
