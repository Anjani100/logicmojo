package com.Array;

public class SortThreeNumbers {
    public static int[] sort012(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1, temp;
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
            }
            else if (nums[mid] == 2) {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                continue;
            }
            mid++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 2, 0, 1, 2};
        sort012(nums);
        System.out.print("Sorted Array: ");
        for (var num : nums) {
            System.out.print(num + " ");
        }
    }
}
