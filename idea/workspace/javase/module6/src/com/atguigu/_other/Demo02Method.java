package com.atguigu._other;

public class Demo02Method {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        extracted(arr);
    }

    public static void extracted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
