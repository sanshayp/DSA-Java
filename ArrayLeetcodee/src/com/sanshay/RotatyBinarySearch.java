package com.sanshay;



public class RotatyBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0,  1, 2};
        int target = 0;
        System.out.println(search(arr, target));


    }

    static int search(int[] nums, int target) {
        int pivott = pivot(nums);
        if (pivott == -1) {
            // just binary search
            return binarysearch(nums, target, 0, nums.length - 1);

        }
        if (nums[pivott] == target) {
            return pivott;


        }
        if (nums[0] <= target){
            return binarysearch(nums,target,0,pivott-1);
        }
        return binarysearch(nums,target,pivott+1, nums.length-1);


    }


    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;

            } else if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;

            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;

            } else if (arr[start] < arr[mid]) {
                start = mid + 1;

            }

        }return -1;


    }
    static int binarysearch(int[] arr , int target,int start , int end){


        while (start <= end){
            // find middle element
//            int mid  = (start + end)/2;   might be possible start + end range exeed krdega java ki

            int mid = start+(end-start)/2; // better way to find mid
            if (target < arr[mid]){
                end = mid -1;
            }else if (target>arr[mid]){
                start = mid + 1;

            }else {
                // ans  found
                return mid;
            }
        }return -1;

    }



}
