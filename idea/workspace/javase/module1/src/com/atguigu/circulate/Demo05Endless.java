package com.atguigu.circulate;

public class Demo05Endless {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10;) {
            count++;
            System.out.println("我爱java"+count);
        }

       /* while(true){
            count++;
            System.out.println("我爱java"+count);
        }*/
    }
}
