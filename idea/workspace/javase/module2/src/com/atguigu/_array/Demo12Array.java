
package com.atguigu._array;

import java.util.Random;
import java.util.Scanner;

public class Demo12Array {
    public static void main(String[] args) {
        // 键盘录入一个整数,找出整数在数组中存储的索引位置 :如果查不到,输出-1,代表没有查到
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }
        int data = sc.nextInt();
        System.out.println("输入的值：" + data);
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                System.out.println("索引位置->" + i);
                flag++;
            }
        }
        if (flag <= 0) {
            System.out.println(-1);
        }
    }
}
