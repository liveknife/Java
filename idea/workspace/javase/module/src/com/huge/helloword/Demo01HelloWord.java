package com.huge.helloword;

import java.util.Scanner;

public class Demo01HelloWord {
    public static void main(String[] args) {
        int i = (int) 10.5;
        System.out.println("i = " + i);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
        }
    }
}