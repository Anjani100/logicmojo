package com.Array;

public class JumpGame {
    public static int jumpGame(int[] nums) {
        if (nums.length == 1)   return 0;
        int a = nums[0], b = nums[0], jump = 1;
        for (int i = 1; i < nums.length - 1; i++) {
            a--;
            b--;
            b = Math.max(b, nums[i]);
            if (a == 0) {
                a = b;
                jump++;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,1,0};
        System.out.println("Minimum jumps required to reach the end: " + jumpGame(nums));
    }
}
