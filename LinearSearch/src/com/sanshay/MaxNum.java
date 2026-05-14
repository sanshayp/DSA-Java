package com.sanshay;

public class MaxNum {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        int sum =0;
        for(int[] num: accounts){
            for(int nums:num){
                sum+=nums;

            }
            if(sum>ans){
                sum = ans;
            }
        }return sum;

    }
}
