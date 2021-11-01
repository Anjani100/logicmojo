package com.Array;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int j = 1, temp;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[j - 1]) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 1, 1, 2, 2, 2, 2};
        int j = removeDuplicates(nums);
        System.out.print("Modified Array: ");
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
