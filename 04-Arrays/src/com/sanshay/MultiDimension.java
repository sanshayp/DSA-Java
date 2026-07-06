package com.sanshay;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    /*

       1 2 3
       4 5 6
       7 8 9

     */
//    int[][] arr = new int[3][];
//
//        int[][] arr2d={
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };

        int [][] arr = new int[3][3];
        System.out.println(arr.length); // no. of rows are printed
        
        
        //INPUT
        for (int row = 0; row < arr.length; row++) {
            //for each col in evry row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }

        //OUTPUT

         // JUST PRINT VALUES NO BRACKETS AND COMMAS
//            for (int row = 0; row < arr.length; row++) {
//                //for each col in evry row
//                for (int col = 0; col < arr[row].length; col++) {
//                    System.out.print(arr[row][col]+ " ");
//                }
//                System.out.println();
//                }
////        SEMI ENHANCEDD
//        for (int row = 0; row < arr.length; row++) {
//
//            System.out.println(Arrays.toString(arr[row]));
//
//        }

        // ennhmaced
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
            
        }


    }

