package com.hhj.leetcode;

import java.util.Arrays;

/**
 *
 */
public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int[] retArr = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                retArr[i] = nums[left] * nums[left];
                left++;
            } else {
                retArr[i] = nums[right] * nums[right];
                right--;
            }
        }
        return retArr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));

    }
}
