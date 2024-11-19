package com.atguigu.circulate;

public class Demo06Nest {
    public static void main(String[] args) {
        /*for (int fen = 1; fen <= 60; fen++) {
            for (int miao = 0; miao < 61; miao++) {
                System.out.println(fen+"分"+miao+"秒");
            }
        }*/
        //外层循环控制行
        for (int i = 0; i < 5; i++) {
            //内层循环控制列
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=========================");
        for (int i = 1; i < 5; i++) {
            for (int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
