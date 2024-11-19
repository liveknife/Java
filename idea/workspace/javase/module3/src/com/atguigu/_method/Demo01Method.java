package com.atguigu._method;

public class Demo01Method {
    public static void main(String[] args) {
        String[] a = new String[10];
        a[5] = "白龙马";
        GetMethod(); // a.无参无返回值方法
        PrintMethod(a); // b.有参无返回值方法
        int n = PrintMethod(); // c.无参有返回值方法
        System.out.println(n + "无参有返回值方法");
        String s = PrintMethod(200); // d.有参有返回值方法
        System.out.println(s + "有参有返回值方法");
    }
    // a.无参无返回值方法
    public static void GetMethod() {
        System.out.println('1');
    }
    // b.有参无返回值方法
    public static void PrintMethod(String[] a) {
        System.out.println(a[5]);
    }
    // c.无参有返回值方法
    public static int PrintMethod() {
        int a = 10;
        int b = 20;
        return a * b;
    }
    // d.有参有返回值方法
    public static String PrintMethod(int a) {
        int b = 20;
        return a + "" + b;
    }
}
