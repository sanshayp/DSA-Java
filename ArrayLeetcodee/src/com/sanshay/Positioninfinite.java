package com.sanshay;

public class Positioninfinite {
    public static void main(String[] args) {
    }

    static int ans(int[] arr,int target){
        // FIRST FINND THE RANGE
        // FIRST START WITH BOX OF SIZE 2
        int start = 0;
        int end = 1;

        //cond for target to lie in range

        while(target > arr[end]){
            int temp = end + 1;
            // doub;e the box value
            // edn = previous end + boxsize*2
            end  = end +(end-start+1)*2;
            start = temp;


        }
        return binarysearch(arr,target,start,end);

    }
    static  int binarysearch(int[] arr , int target,int start , int end){


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
