package com.sanshay;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ARRAY OF PRIMITIVES
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1]=34;
       // long this  way


//        input using loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }

        //THREEE WAYS TO PRINT AN ARRAY


//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//        for (int num : arr) {
//            System.out.print(num + " "); //num is the element  of the array
//
//        }
//
//        System.out.println(Arrays.toString(arr));


        //ARRAY OF OBJECTS

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1]="sanshay";
        System.out.println(Arrays.toString(str));



    }
}
