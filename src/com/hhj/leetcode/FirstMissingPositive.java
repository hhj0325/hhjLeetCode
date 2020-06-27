package com.hhj.leetcode;

/**
 * https://leetcode-cn.com/problems/first-missing-positive/
 */

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {7,8,9,11,12};
        System.out.println(FirstMissingPositive.firstMissingPositive(nums));
    }
}
