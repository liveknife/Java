package com.atguigu._this;

public class Person {
    String name;
    public void speak(String name) {
        System.out.println(this.name + "你好, 我是 " + name);
    }
}
