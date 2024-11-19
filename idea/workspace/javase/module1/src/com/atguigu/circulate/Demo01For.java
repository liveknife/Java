package com.atguigu.circulate;

public class Demo01For {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < 100; i++) {
            // sum += i;
            // 3.判断,如果是偶数,相加,将加的结果赋值给sum
            if (i % 2 == 0) {
                count++;
                sum += i;
            } else {
                count1++;
                sum1 += i;
            }
        }
        System.out.println("sum +=: " + sum); // 偶数和
        System.out.println("sum1 +=: " + sum1); // 奇数和
        System.out.println("偶数有: " + count); // 偶数个数
        System.out.println("奇数有: " + count1); // 奇数个数
        // 快捷键 3.fori -> 循环次数.fori
    }
}
