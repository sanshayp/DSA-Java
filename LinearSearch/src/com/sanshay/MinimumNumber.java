package com.sanshay;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] nums = {34, 334, -7, 423413,2 ,23,2124};
        System.out.println(MinNum(nums));
    }
    static int MinNum(int[] arr){
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {


            if(min>arr[index]){
                min = arr[index];


            }

        }
        return min;



    }


}
