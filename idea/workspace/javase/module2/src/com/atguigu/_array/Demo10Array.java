
package com.atguigu._array;


import java.util.Random;
import java.util.Scanner;

public class Demo10Array {
    public static void main(String[] args) {
        // 随机产生10个[0,100]之间整数，统计既是3又是5，但不是7的倍数的个数
        Random rd = new Random();
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
        }
        for (int j : arr) {
            if ((j % 3 == 0 && j % 5 == 0) && j % 7 != 0) {
                count++;
            }
        }
        System.out.println(count);

        // 用一个数组存储本组学员的姓名，从键盘输入，并遍历显示
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[3];
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学员名字");
            strArr[i] = sc.nextLine();
        }
        for (String j : strArr) {
            System.out.println(j);
        }
    }
}
