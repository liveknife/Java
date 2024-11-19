package com.huge.logic;
import java.util.Random;

public class Demo02Logic {
    public static void main(String[] args) {
      Random random = new Random();
      int a = random.nextInt(101);
      int b = random.nextInt(101);
      //boolean result01 = (++a>100)&(++b>10);
      //boolean result01 = (++a > 100) && (++b > 10);

      //boolean result01 = (++a<100)|(++b>10);
      boolean result01 = (++a<100)||(++b>10);
      System.out.println("result01 = " + result01);
      System.out.println("a = " + a);
      System.out.println("b = " + b);
    }
}
