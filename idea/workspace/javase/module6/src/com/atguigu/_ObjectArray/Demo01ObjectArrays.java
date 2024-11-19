package com.atguigu._ObjectArray;

public class Demo01ObjectArrays {
    public static void main(String[] args) {
        Person p1 = new Person("大郎", 26);
        Person p2 = new Person("金莲", 24);
        Person p3 = new Person("门庆", 25);
        Person[] people = {p1, p2, p3};

        for (Person p : people) {
            System.out.println(p.getName() + "...." + p.getAge());
        }
    }
}
