package com.sanshay;

import java.util.Arrays;

public class SearchSTring {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
//        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name, target));
    }


//    static boolean search(String str, char target){
//        if(str.length()  == 0){
//            return false;
//
//        }
//        for (int index = 0; index < str.length(); index++) {
//               char element = str.charAt(index);
//               if (target == element){
//                   return true;
//
//
//               }
//
//
//
//        }

//        return false;
//    }
    static boolean search2(String  str , char target){
        if(str.length()==0) {
            return false;
        }

        for(char ch: str.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}
