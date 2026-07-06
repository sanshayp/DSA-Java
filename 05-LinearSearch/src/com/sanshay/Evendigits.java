package com.sanshay;

public class Evendigits {
    public static void main(String[] args) {
        int [] num ={12,23,435,34};
        System.out.println(findNumbers(num));


    }
    static int findNumbers(int[] mums) {
        int count = 0;
        for (int number : mums) {
            if (even(number) != true) {
                continue;
            }
            count++;
        }
    return count;
    }

        // functuon to check if functuon contains even digit or not
    static boolean even(int number) {
        int countt=0;
        while(number>0){
            countt++;
            number= number/10;

        }
        return countt % 2 == 0;
    }

}
