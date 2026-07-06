package com.sanshay.patterns;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        triangle(4,0);
        int[] arr = {4,3,2,1};
        selection1(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void triangle(int r ,int c){

        if(r==0) return;


        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1,0);
        }
    }


    static void triangle2(int r ,int c){

        if(r==0) return;


        if(c<r){

            triangle2(r,c+1);
            System.out.print("*");
        }
        else{

            triangle2(r-1,0);
            System.out.println();
        }
    }





    static void bubble(int[] arr,int r ,int c){

        if(r==0) return;


        if(c<r){
            if(arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr,r,c+1);
        }
        else{

            bubble(arr,r-1,0);
        }
    }




    static void selection(int[] arr,int r ,int c){

        if(r==c) return;
        if(c<r){
            int maxIndex = max(arr,r,c);
            swap(arr,maxIndex,arr.length-c-1);



            selection(arr,r,c+1);


        }
    }

    static int max(int[] arr, int r, int c) {

        int maxIndex = 0;

        for (int i = 1; i < arr.length - c; i++) {

            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    static void swap(int[] arr,int f,int s){
        int temp =arr[f] ;
        arr[f]=arr[s];
        arr[s] = temp;
    }





    static void selection1(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection1(arr, r, c+1, c);
            } else {
                selection1(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection1(arr, r-1, 0, 0);
        }
    }


}
