package com.Array;

import java.util.ArrayList;
import java.util.Random;

public class MergeSort {
    public static ArrayList<Integer> merge(ArrayList<Integer> nums, ArrayList<Integer> array, int low, int high) {
        if (high - low < 2)    return nums;
        int mid = (low + high) / 2;
        ArrayList<Integer> left = merge(nums, array, low, mid);
        ArrayList<Integer> right = merge(nums, array, mid, high);
        int i = low, k = low, j = mid;
        while (i < mid && j < high) {
            if (left.get(i) < right.get(j)) {
                array.set(k, left.get(i));
                i++;
            }
            else {
                array.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < mid) {
            array.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < high) {
            array.set(k, right.get(j));
            j++;
            k++;
        }
        for(i = low; i < high; i++)
            nums.set(i, array.get(i));
        return nums;
    }
    public static void mergeSort(ArrayList<Integer> nums) {
        merge(nums, (ArrayList<Integer>) nums.clone(), 0, nums.size());
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            array.add(random.nextInt(1_000_000));
        }
//        System.out.println("The sorted array is:");
        long start = System.currentTimeMillis();
        mergeSort(array);
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + "ms");
    }
}
