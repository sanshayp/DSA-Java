package com.sanshay;

public class Count {
    public static void main(String[] args) {
        int  number =478772776;

        int count = 0;

        while(number>0){

            int rem = number%10;
                if (rem == 7){
                    count++;

                }
                number/=10;
            }
        System.out.println(count);
        }
    }



