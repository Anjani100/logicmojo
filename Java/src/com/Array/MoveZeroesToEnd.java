package com.Array;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int zero = 0, temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 0, 2, 0, 3, 4, 0};
        moveZeroes(nums);
        System.out.print("Modified Array: ");
        for (var num : nums) {
            System.out.print(num + " ");
        }
    }
}
