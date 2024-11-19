package com.atguigu.overload;


import java.util.Scanner;

public class Demo02overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    public static void open(){}
    public static void open(int a){}
    // static void open(int a,int b){}
    public static void open(double a,int b){}
    // public static void open(int a,double b){}
    public void open(int i,double d){}
    public static void OPEN(){}
    public static void open(int i,int j){}
}
