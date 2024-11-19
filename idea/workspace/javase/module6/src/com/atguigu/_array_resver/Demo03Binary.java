package com.atguigu._array_resver;

public class Demo03Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = binarySearch(6, arr);
        System.out.println("i -> " + i);
    }
    public static int binarySearch(int data, int[] arr) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while(min <= max){
            mid = (min + max)/ 2;
            if (data > arr[mid]){
                min = mid + 1;
            }else if(data < arr[mid]){
                max = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
