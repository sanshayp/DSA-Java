package com.sanshay;

import java.util.Arrays;

public class HighestAltitude1732 {
    public static void main(String[] args) {
        int[] gain = {52,-91,72};
        System.out.println(largestAltitude(gain));
        System.out.println(Arrays.toString(Altitude(gain)));

    }
    static int largestAltitude(int[] gain) {
        int[] arr=Altitude(gain);
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }return max;

    }
    static int[] Altitude(int[] gain){
        int[] arr =  new int[gain.length + 1];

        for(int i = 0;i<arr.length;i++){
            int value = 0;

            for(int j = 0;j<i;j++){
                value+=gain[j];
            }
            arr[i]=value;
        }return  arr;
    }

}
