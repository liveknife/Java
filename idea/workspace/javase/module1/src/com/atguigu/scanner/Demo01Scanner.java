package com.atguigu.scanner;
import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * sc.nextInt() 输入整数int型的
        * sc.next()    输入字符串  String型的
        * */
        int n = sc.nextInt(); // 录入 int 整数
        System.out.println(n);
        String s = sc.next(); // 录入 String 字符串
        System.out.println(s);
    }
}
