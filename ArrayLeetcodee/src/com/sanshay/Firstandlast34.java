package com.sanshay;

import java.util.Arrays;

public class Firstandlast34 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,6,6,7};
        int target = 6;

        int[] result = searchRange(arr, target);

        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // find first occurrence
        ans[0] = search(nums, target, true);

        // find last occurrence (only if first exists)
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    // Binary search helper
    public static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;   // move left
                } else {
                    start = mid + 1; // move right
                }
            }
        }

        return ans;
    }
}

