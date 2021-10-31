package com.Array;

public class MountainPeak {
    public static int peakIndexInMountainArray(int[] nums) {
        int low = 0, mid, high = nums.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid == 0) {
                low++;
                continue;
            }
            if (mid == nums.length - 1) {
                high--;
                continue;
            }
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > 0 && nums[mid] > nums[mid - 1])  low = mid + 1;
            else    high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0,2,1,0};
        System.out.println("Maximum value is at index: " + peakIndexInMountainArray(nums));
    }
}