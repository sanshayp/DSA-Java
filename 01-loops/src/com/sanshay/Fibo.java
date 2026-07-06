package com.sanshay;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int num = in.nextInt();

        int count = 2;

        while (count <= num) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);
    }

}
