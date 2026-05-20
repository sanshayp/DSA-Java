package com.sanshay;

import java.util.Arrays;

public class Plusone66 {
    public static void main(String[] args) {
        int[] nums = {99,99};
        System.out.println(Arrays.toString(ans(nums)));

    }
    static int[] ans(int[]arr){
        for (int i = arr.length-1 ;i>=0; i--) {
            if(arr[i]==9) {
                arr[i] = 0;


            }
            else{
                arr[i]++;
                return arr;
            }
        }int[] newarr = new int[arr.length+1];
        newarr[0]=1;
        return newarr;

    }

}
