package com.sanshay;

public class Main {
    public static void main(String[] args) {
        int[] numd = {23, 45, 56, 77};
        int target = 40;
        boolean ans = linearsearch3(numd, target);
        System.out.println(ans);
    }


    // search in the array: return index if item fou d else -1



//    static int linearsearh(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        // run fir loop
//
//        for (int index = 0; index < arr.length; index++) {
//
//            // check element at every index
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }
//
//
//        }
//        //this line will execute  if above executed hence target no fouynd
//        return -1;
//    }


    // search the target and return the  element



//    static int linearsearch2(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        // run fir loop
//
//        for (int element : arr) {
//
//            // check element at every index
//            if (element == target) {
//                return element;
//            }
//
//
//        }
//        //this line will execute  if above executed hence target no fouynd
//        return -1;
//    }

    // search the target and  return true or false

    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false ;
        }
        // run fir loop

        for (int element : arr) {

            // check element at every index
        return  element== target;


        }
        //this line will execute  if above executed hence target no fouynd
        return false;
    }




}





