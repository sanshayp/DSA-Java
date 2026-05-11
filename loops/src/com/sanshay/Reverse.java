package com.sanshay;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number= in.nextInt();
        int reverse=0;
        while (number>0){

            int rem = number%10;
            reverse = reverse*10 +rem;

            number/=10;
        }

        System.out.println(reverse);
    }


}
