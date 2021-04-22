package com.hhj.leetcode;

/**
 *
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n + 1) * n / 2;
        int b = 0;
        for (int tmp : nums) {
            b += tmp;
        }
        return total - b;
    }

    public static void main(String[] args) {
        System.out.println(MissingNumber.missingNumber(new int[]{3, 0, 1}));
        System.out.println(MissingNumber.missingNumber(new int[]{0, 1}));
        System.out.println(MissingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(MissingNumber.missingNumber(new int[]{0}));

    }
}
