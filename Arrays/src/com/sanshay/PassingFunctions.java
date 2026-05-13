package com.sanshay;

import java.util.Arrays;

public class PassingFunctions {

    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums  ));

    }
    static void change(int[] arr){
        arr[0]= 99;
    }


}



