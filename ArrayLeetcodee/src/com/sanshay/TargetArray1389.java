package com.sanshay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

    }


        public int[] createTargetArray(int[] nums, int[] index) {
            List <Integer> arr = new ArrayList<>(10);
            for (int i =0;i<nums.length;i++){
                arr.add(index[i],nums[i]);
            }
            int[] array = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                array[i] = arr.get(i);
            }
            return array;


    }
}
