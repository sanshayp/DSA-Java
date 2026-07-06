package com.sanshay;

import java.util.ArrayList;
import java.util.List;

public class Candies1431 {
    public static void main(String[] args) {
        int[] candles = {2,3,5,1,3};
        int extracandies = 3;


    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        int maxx = MaxVal(candies);
        List<Boolean> arr = new ArrayList<>(10);
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i]+extraCandies >= maxx)) {
                arr.set(i, true);
            }
            else {
                arr.set(i, false);
            }
        }

        return arr;
    }

    static int MaxVal(int[] candies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] < candies[i + 1]) {
                max = candies[i + 1];
            } else {
                max = candies[i];
            }

        }return max;
    }
}


