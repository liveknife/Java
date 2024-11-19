package com.atguigu.twoArray;

public class Demo02TwoArray {
    public static void main(String[] args) {
        String[][] arr3 = {{"孙悟空","唐僧"},{"刘备","关羽","张飞"},{"宋江"},{"林黛玉","贾宝玉","王熙凤","薛宝钗"}};
        for (String[] j : arr3) {
            for (String k : j) {
                System.out.println(k);
            }
        }
    }
}
