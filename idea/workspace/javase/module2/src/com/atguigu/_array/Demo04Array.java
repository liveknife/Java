package com.atguigu._array;

import java.util.Random;

public class Demo04Array {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            int data = rand.nextInt(10);
            a[i] = data;
        }
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
