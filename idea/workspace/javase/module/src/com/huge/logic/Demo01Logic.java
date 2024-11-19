package com.huge.logic;
import java.util.Random;

public class Demo01Logic {
    public static void main(String[] args) {
      Random random = new Random();
      int i = random.nextInt(31);
      int j = random.nextInt(31);
      int k = random.nextInt(31);
      System.out.println("i -> " + i + " j -> " + j + " k -> " + k);
      boolean result01 = (i>j) && (i==k);
      System.out.println("result01 = " + result01);

      boolean result02 = (i>j) || (i==k);
      System.out.println("result02 = " + result02);

      boolean result03 = (i>j) ^ (i==k);
      System.out.println("result03 = " + result03);

      boolean result04 = !(i>j) ;
      System.out.println("result04 = " + result04);
    }
}
