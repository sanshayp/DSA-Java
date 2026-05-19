package com.sanshay;

public class Comparison {
    public static void main(String[] args) {
        String a = new String("Kunal");
        String b = new String("Kunal");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.charAt(1));


        // == is for memory reference
        //.equals check actual characters
    }

}
