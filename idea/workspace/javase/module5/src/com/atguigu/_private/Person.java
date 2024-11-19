package com.atguigu._private;

public class Person {
    private String name;
    private int age;

    public void setName (String n) {
        name = n;
    }
    public String getName () {
        return name;
    }
    public void setAge (int n) {
        if (n > 0 && n < 150)
            age = n;
        else {
            age = 0;
        }
    }
    public int getAge () {
        return age;
    }
}
