package com.huge.arithmetic;

public class Demo01Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int add = i+j;//推荐使用
        System.out.println(add);//13
        System.out.println(i+j);//13

        int sub = i-j;
        System.out.println(sub);//7

        int mul = i*j;
        System.out.println(mul);//30

        int div = i/j;
        System.out.println(div);//3

        int mo = i%j;
        System.out.println(mo);//1
        System.out.println("--------------->>>>>>>>>>>>>>>>");
        System.out.println(i + "" + j);
        System.out.println("i和j相加只和为:" + (i + j));
        System.out.println("i和j相加只和为:" + i + j);
        System.out.println("---------------------------------");
        for (int d = 0; d < 10; d++) {
            int n = 0;
            System.out.println(n++);
        }
        for (int d = 0; d < 10; d++) {
            int n = 0;
            System.out.println(++n);
        }
    }
}