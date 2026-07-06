package com.sanshay;

import java.util.Arrays;

public class SearchIn2d {
    public static void main(String[] args){
        int nums[][]={
                {1, 2, 3},
                {4,389, 6},
                {7, 8, 9}
        };
        int target = 5;
        int[] ans=search(nums,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(min(nums));

    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }

            }

        }

        return new int[]{-1,-1} ;
    }

    static int min(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }

        }
        return max;
    }

}
