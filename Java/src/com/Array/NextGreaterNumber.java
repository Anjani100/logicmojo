package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreaterNumber {
    public static void nge(int[] nums) {
        int i, min, temp, n = nums.length - 1;
        boolean flag = true;
        for (i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                min = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > nums[i - 1] && nums[min] > nums[j]) {
                        min = j;
                    }
                }
                temp = nums[i - 1];
                nums[i - 1] = nums[min];
                nums[min] = temp;
                Arrays.sort(nums, i, nums.length);
                flag = false;
                break;
            }
        }
        if (flag)   Arrays.sort(nums);
        List<Integer> result = new ArrayList<Integer>();
        for(int num : nums) {
            result.add(num);
        }
//        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {2, 1, 8, 7, 6, 5};
        nge(nums);
        System.out.print("Next Greater Number: ");
        for (var num : nums) {
            System.out.print(num);
        }
    }
}
