package com.sanshay;

import java.util.Locale;

public class Palin {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(ispalin(str));

    }
    static boolean ispalin(String str){
        str = str.toLowerCase();
        int i = 0;
        int start =0;
        int end = str.length()-1;
        while(start<end){
            start = i;
            end = (str.length()-1-i);
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            i++;


        }return true;


    }
}
