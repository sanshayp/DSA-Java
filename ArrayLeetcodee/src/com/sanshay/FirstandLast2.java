package com.sanshay;

import java.util.Arrays;

public class FirstandLast2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,78,989,76,5};
        int target = 4;
        System.out.println(Arrays.toString(search(arr, target)));

    }
    static int[] search(int[] nums,int target){
        int start = 0;
        int end = nums.length -1;
        int first = -1;
        int last = -1;
        while(start<=end){
            int mid = start+(end - start)/2;

            if(target>nums[mid]){
                start=mid+1;
            }
            else if (target<nums[mid]){
                end = mid-1;
            }
            else{
                first = mid;
                end = mid-1;
            }
        }
        start=0;
        end = nums.length-1;

        while(start<=end){
            int mid = start+(end - start)/2;
            if(target>nums[mid]){
                start = mid+1;
            } else if (target < nums[mid]) {
                end = mid-1;

            }
            else{
                last = mid;
                start = mid+1;

            }

        }

        return new int[]{first,last};
    }


}
