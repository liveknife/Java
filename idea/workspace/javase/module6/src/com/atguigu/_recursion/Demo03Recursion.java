package com.atguigu._recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        int method = method(7);
        System.out.println("method = " + method);
    }

    public static int method(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        System.out.println(n);
        return method(n - 1) + method(n - 2);
    }
}

