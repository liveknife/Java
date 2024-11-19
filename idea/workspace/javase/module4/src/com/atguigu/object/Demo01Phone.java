package com.atguigu.object;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        String str = phone.message();
        phone.call("王军");
        System.out.println(str);
    }
}
