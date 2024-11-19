package com.atguigu._ObjectArray;

public class Student {
    private String name;
    private int Grade;

    public Student(String name, int grade) {
        this.name = name;
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }
}
