
package com.atguigu._array;

import java.util.Random;

public class Demo11Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("\n");
        // 需求:随机50个1-100之间的整数,统计偶数个数
        int[] a = new int[50];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(101);
        }
        for (int j : a) {
            if (j % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
