package com.atguigu._array;

public class Demo01Array {
    public static void main(String[] args) {
        // 动态初始化数组
        int[] a = new int[10];
        String[] b = new String[10];

        // 静态初始化数组
        int[] c = new int[]{1,2,3,4,5}; // 不使用
        String d[] = new String[]{"1","2","3","4","5"}; // 不使用
        int[] e = {1,2,3,4,5}; // 使用
        String[] f = {"1","2","3","4","5"}; // 不使用
    }
}
