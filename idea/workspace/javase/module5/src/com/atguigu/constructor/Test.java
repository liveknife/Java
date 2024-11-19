package com.atguigu.constructor;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        Person person2 = new Person("涛哥", 18);
        System.out.println(person2.getName()+"..."+person2.getAge());

    }
}
