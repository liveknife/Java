package com.atguigu._array_resver;

public class Demo01Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for (int min = 0, max = arr.length-1; min < max; min++,max--){
            System.out.println("min -> " + min + " max -> " + max);
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
