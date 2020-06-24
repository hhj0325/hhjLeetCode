package com.hhj.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
        Set<Integer> intSet = new HashSet<>();
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            intSet.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            min = target - nums[i];
            if (intSet.contains(min)) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == min && i != j) {
                        System.out.println(Arrays.toString(new int[]{i, j}));
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums2 = {2, 7, 11, 15};
        int target2 = 9;
        long a = System.currentTimeMillis();
        TwoSum.twoSum(nums2, target2);
        System.out.println("time:" + (System.currentTimeMillis() - a));
    }

}
