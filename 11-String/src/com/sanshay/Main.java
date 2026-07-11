package com.sanshay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String name = "Sanshay Patiyal";
//        System.out.println(name);
//
//
//        String a = "Sanshay";
//        System.out.println(a);
//        a = "Patiyal";
//        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        String find = sc.nextLine();


        int len = find.length();

        for (int i = 0; i < len / 2; i++) {
            if (find.charAt(i) != find.charAt(len - i - 1)) {
                System.out.println("not aplaidnromw");
                return;

            }

            System.out.println("pal");

        }

    }
}
