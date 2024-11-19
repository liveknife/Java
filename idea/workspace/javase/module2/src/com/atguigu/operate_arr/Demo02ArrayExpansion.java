package com.atguigu.operate_arr;

public class Demo02ArrayExpansion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        a = b;
        System.out.println(a.length);
    }
}
