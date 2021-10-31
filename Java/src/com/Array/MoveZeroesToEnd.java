package com.Array;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int zero = 0;
        for (int i = 0; i < nums.length; i++) 
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 2, 0, 1, 2};
        moveZeroes(nums);
        System.out.print("Sorted Array: ");
        for (var num : nums) {
            System.out.print(num + " ");
        }
    }
}
