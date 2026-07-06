package com.sanshay.sorting;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

    }


    static int[] Mergesort(int[] arr){
        if(arr.length ==1) return arr;

        int  mid = arr.length/2;

        int[] left = Mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = Mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }

    private static int[] merge(int[] first , int[] second){

        int[] mix = new int[first.length+second.length];
        int i = 0;
        int j =0;
        int k = 0;

        while(i< first.length && j< second.length) {
            if (first[i] > second[j]) {
                mix[k] = second[j];
                j++;
            } else {
                mix[k] = first[i];
                i++;
            }
            k++;
        }
        while(i< first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while(j< second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }

}
