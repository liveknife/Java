package com.atguigu.operate_arr;

public class Demo03Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] newArr = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            newArr[a.length + i] = b[i];
        }
        for (int j : newArr) {
            System.out.print(j + " ");
        }
    }
}
 