package com.sanshay;

public class Rotationcount {
    public static void main(String[] args) {
        int[] arrr = {2,3,6,12};
        System.out.println(count(arrr));


    }
    static int count(int[] nums){
        int pivott = pivot(nums);
            return pivott+1;
        }

        static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
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

        }
        return -1;
    }
}


