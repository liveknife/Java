package com.atguigu.javabean;

public class Test {
    public static void main(String[] args) {
        Student sd = new Student();
        sd.setName("萧太后");
        sd.setSid(11805);
        String a = sd.getName();
        System.out.println(a);
    }
}
