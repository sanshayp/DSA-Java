package com.sanshay;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-12,-10,0,12,44,78,989};
        int target = 78;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
        //   ARRAY IS SORTED IN ASCENDING ORDER

    // return the index
    // return -1 if does not exist
    static  int binarysearch(int[] arr , int target){
        int start =0;
        int end = arr.length -1 ;

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
