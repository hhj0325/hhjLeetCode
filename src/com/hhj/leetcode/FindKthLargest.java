package com.hhj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * @author huhaojian
 * @date 2020/6/29 002919:46
 */
public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int k = 2;
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        System.out.println(FindKthLargest.findKthLargest(nums, k));

    }
}
