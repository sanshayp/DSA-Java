package com.sanshay.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};

        arr = mergesSort(arr);
        System.out.println(Arrays.toString(arr));
//        mergesSortinplace(arr,0, arr.length);
//        System.out.println(Arrays.toString(arr));

    }

    static int[] mergesSort(int[] arr){
       if(arr.length == 1){
           return arr;

       }
       int mid = arr.length/2;


       int[] left = mergesSort(Arrays.copyOfRange(arr,0,mid));
       int[] right = mergesSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){

        int[] mix = new int[first.length + second.length];
        int i = 0;
        int  j = 0;
        int k =0;

        while(i < first.length && j< second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;

        }


            // kya pta array na khatam hua ho

        while (i<first.length){
            mix[k] = first[i];
            i++;
            k++;

        }
        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }








    /// / IN PLACE

    static void  mergesSortinplace(int[] arr, int s, int e){
        if(e - s == 1){
            return ;

        }
        int mid = s -(s-e)/2;


        mergesSortinplace(arr,s,mid);
        mergesSortinplace(arr,mid,e);

        mergeinplace(arr,s,mid,e);
    }
    private static void mergeinplace(int[] arr,int s,int m,int e){

        int[] mix = new int[e-s];
        int i = s;
        int  j = m;
        int k =0;

        while(i < m && j< e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;

        }


        // kya pta array na khatam hua ho

        while (i<m){
            mix[k] = arr[i];
            i++;
            k++;

        }
        while(j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }

    }



}
