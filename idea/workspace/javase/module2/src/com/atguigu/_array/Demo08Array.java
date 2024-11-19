package com.atguigu._array;


public class Demo08Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr.length);//3
        arr = null;
        System.out.println(arr.length);//NullPointerException
    }
}
