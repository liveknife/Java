package com.atguigu._array;


public class Demo06Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        //需求:将arr中的数据放到另外一个数组中

     /*
       如果我们想将arr中的数据复制到新数组中
       那么新数组的长度就应该是arr数组的长度
      */
        int[] newArr = new int[arr.length];

        System.out.println(newArr[0]);//默认值0
        System.out.println(newArr[1]);//默认值0
        System.out.println(newArr[2]);//默认值0
        System.out.println(newArr[3]);//默认值0
        System.out.println(newArr[4]);//默认值0
        System.out.println(newArr[5]);//默认值0


     /*
       将arr数组指定索引位置上的元素获取出来放到等号左边newArr数组的指定索引位置上
      */
    /* newArr[0] = arr[0];
     newArr[1] = arr[1];
     newArr[2] = arr[2];
     newArr[3] = arr[3];
     newArr[4] = arr[4];
     newArr[5] = arr[5];*/


        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        //遍历
        for (int j : newArr) {
            System.out.println(j);
        }
    }
}
