package com.atguigu._ObjectArray;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Student s1 = new Student("小红", 88);
        Student s2 = new Student("小明", 60);
        Student s3 = new Student("小绿", 59);
        Student[] students = { s1, s2, s3 };
        Student[] sort1 = GradeSort(students);
        for (Student student : sort1) {
            System.out.println(student.getGrade() + "---->>>>>" + student.getName());
        }
    }
    public static Student[] GradeSort (Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getGrade() > students[j + 1].getGrade()) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        return students;
    }
}
