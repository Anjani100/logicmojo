package com.Array;

import java.util.ArrayList;

public class LeftSideLessRightSideMore {
    public static int findElement(int[] nums) {
        int res = -1;
        int[] left = new int[nums.length];
        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = Math.max(nums[i], left[i - 1]);
        }
        int right = nums[nums.length - 1];
        for (int i = nums.length - 2; i > 0; i--) {
            if (nums[i] <= right && nums[i] >= left[i]) {
                res = nums[i];
            }
            right = Math.min(right, nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {10, 6, 3, 1, 5, 11, 6, 1, 11, 12};
        System.out.println("The required element is: " + findElement(nums));
    }
}
