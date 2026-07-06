package com.sanshay;

public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 34713, 3, 367264, 455, 55};
//        System.out.println(max(arr));

        System.out.println(maxrange(arr , 0, 4 ));
    }

//    static int max(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] < arr[i + 1]) {
//                max = arr[i + 1];
//            }
//
//        }


//        return max;

        static int maxrange(int[] arr, int start,int end) {
            int maxVal = arr[start];
            for (int i = start; i < end; i++) {
                if (arr[i] < arr[i + 1]) {
                    maxVal = arr[i + 1];
                }

            }
            return maxVal;

        }


}