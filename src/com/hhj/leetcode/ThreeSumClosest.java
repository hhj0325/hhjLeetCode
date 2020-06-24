package com.hhj.leetcode;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *
 * @author huhaojian
 * @date 2020/6/24 002411:39
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0};
        int target = -100;
        long a = System.currentTimeMillis();
        ThreeSumClosest.threeSumClosest(nums, target);
        System.out.println("time:" + (System.currentTimeMillis() - a));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int retsum = 0;
        int gap = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                int near = Math.abs(sum - target);
                if (sum == target) {
                    System.out.println("pre sum:" + sum);
                    return sum;
                }
                if (near < gap) {
                    gap = near;
                    retsum = sum;
                }

                if (sum > target) {
                    end--;
                }
                if (sum < target) {
                    start++;
                }
            }
        }
        System.out.println("post sum:" + retsum);
        return retsum;
    }
}
