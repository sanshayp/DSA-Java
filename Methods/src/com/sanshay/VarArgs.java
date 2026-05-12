package com.sanshay;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
        multiple(2,3,"rahul","AMIT");  //order  mai hona chahiye

    }

    static void multiple(int a, int b ,String...v){
        //variable lenght arg last hona chaiye


        System.out.println(Arrays.toString(v));


    }
    static  void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
