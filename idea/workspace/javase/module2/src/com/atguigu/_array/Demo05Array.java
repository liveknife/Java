package com.atguigu._array;


public class Demo05Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        // 数组遍历的增强写法
        for (int j : arr) {
            System.out.println(j);
        }

        // 数组遍历的常规写法
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
    }
}
