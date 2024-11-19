package com.atguigu._Param;

public class Demo02Param {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        method(arr);
    }
    public static void method(int[] arr) {
        arr[0] += 10;
        arr[1] += 20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
