package com.sanshay;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {12, 4, 45, 542, 3};
        System.out.println(linearsearh(nums,3,0,5));

    }

    static int linearsearh(int[] arr, int target,int start, int end) {

        if (arr.length == 0) {
            return -1;
        }
        // run fir loop

        for (int index = start; index <= end; index++) {


            // check element at every index
            int element = arr[index];
            if (element == target) {
                return index;
            }


        }
        //this line will execute  if above executed hence target no fouynd
        return -1;
    }

}
