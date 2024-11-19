package com.huge.compare;
import java.util.Random;

public class Demo01Compare {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(101);
        int j = random.nextInt(101);
        System.out.println(i + "->" + j);
        boolean result01 = i == j;
        System.out.println("result01 = " + result01);
        System.out.println(i > j);
        System.out.println(i < j);
        System.out.println(i >= j);
        System.out.println(i <= j);
        System.out.println(i != j);

    }
}