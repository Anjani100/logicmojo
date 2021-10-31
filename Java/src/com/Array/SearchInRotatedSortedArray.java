package com.Array;

public class SearchInRotatedSortedArray {
    public static int searchRS(int[] nums, int target) {
        int low = 0, mid, high = nums.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target)    return mid;
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid])    high = mid - 1;
                else    low = mid + 1;
            }
            else {
                if (nums[mid] <= target && target <= nums[high])    low = mid + 1;
                else    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("The value " + target + " is at index: " + searchRS(nums, target));
    }
}
