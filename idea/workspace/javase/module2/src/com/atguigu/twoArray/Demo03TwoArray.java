package com.atguigu.twoArray;

public class Demo03TwoArray {
    public static void main(String[] args) {
        String[][] arr3 = {{"孙悟空","唐僧"},{"刘备","关羽","张飞"},{"宋江"},{"林黛玉","贾宝玉","王熙凤","薛宝钗"}};
        // 修改以及遍历二维数组
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = i + j + ""; // 修改对应位置的值
                System.out.println(arr3[i][j]); // 输出修改后的值
            }
        }
    }
}
