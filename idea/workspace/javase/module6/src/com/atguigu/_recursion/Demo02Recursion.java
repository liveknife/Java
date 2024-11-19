package com.atguigu._recursion;

public class Demo02Recursion {
    public static void main(String[] args) {
        /*
         *  阶乘 *
         *  method(5); // 返回 5 * 24 = 120
         *  method(4); // 返回 4 * 6 = 24
         *  method(3); // 返回 3 * 2 = 6
         *  method(2); // 返回 2 * 1 = 2
         *  method(1); // 返回 1
         *
         * */
        int method = method(5);
        System.out.println("method = " + method);
    }

    public static int method(int n){
        if (n==1){
            return 1;
        }
        return n * method(n - 1);
    }
}

