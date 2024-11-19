package com.atguigu._recursion;

public class Demo01Recursion {
    public static void main(String[] args) {
        recursion(0);
    }
    public static void recursion(int n) {
        if (n >= 10)
            return;
        n += 1;
        System.out.println("n =>: " + n);
        recursion(n);
    }
}
