package com.atguigu.switch_;

import java.util.Scanner;

public class Demo01Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int data = sc.nextInt();
        switch (data) {
            case 1:
                System.out.println("11");
                break;
            case 2:
                System.out.println("22");
                break;
            case 3:
                System.out.println("33");
                break;
            case 4:
                System.out.println("44");
                break;
            case 5:
                System.out.println("55");
                break;
            case 6:
                System.out.println("66");
                break;
            default:
                System.out.println("啥也没有");
                break;
        }
    }
}
