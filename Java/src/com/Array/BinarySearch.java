package com.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BinarySearch {
    public static int binarySearch(ArrayList<Integer> nums, int target) {
        int low = 0, high = nums.size() - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums.get(mid) == target)    return mid;
            if (nums.get(mid) > target) high = mid - 1;
            else    low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            array.add(random.nextInt(1_000_000_000));
        }
        int target = 50;
        Collections.sort(array);
        System.out.println(array.get(target));
        long start = System.currentTimeMillis();
        System.out.println("The number " + array.get(target) + " is at index " + binarySearch(array, array.get(target)));
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + "ms");
    }
}
