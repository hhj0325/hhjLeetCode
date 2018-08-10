package com.hhj.leetcode;

import java.util.Arrays;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 示例：
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        if (nums.length > 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (target == nums[i] + nums[j]) {
                        ret[0] = i;
                        ret[1] = j;
                        return ret;
                    }
                }

            }

        }
        return ret;
    }

    public static void main(String[] args) {
        int[] in1 = {1, 2, 9, 8, 7};
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 9)));
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 10)));
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 17)));
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 16)));
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 20)));
    }

}
