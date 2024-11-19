package com.atguigu.scanner;
import java.util.Scanner;

public class Demo03Scanner {
    public static void main(String[] args) {
        /*
        *
        * 变量名.next():录入字符串 -> 遇到空格和回车就结束录入了
        * 变量名.nextLine():录入字符串 -> 遇到回车就结束录入了
        *
        * */
        Scanner sc = new Scanner(System.in);
        String data1 = sc.next();
        String data2 = sc.nextLine();
        System.out.println(data1);
        System.out.println(data2);
    }
}