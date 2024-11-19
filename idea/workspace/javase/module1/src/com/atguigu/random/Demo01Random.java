package com.atguigu.random;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random rand = new Random();
        int data = rand.nextInt();
        System.out.println("The random number is " + data);
        // 获取指定范围的随机数
        int n = rand.nextInt(100);
        System.out.println("The random number is 100: " + n);
    }
}
