package com.hhj.leetcode;

/**
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 * @author huhaojian
 * @date 2020/6/28 002819:23
 */
public class MinSubArrayLen {
    public static int minSubArrayLen(int s, int[] nums) {
        int start = 0, end = 0;
        int count = Integer.MAX_VALUE;
        int sum = 0;

        while (end < nums.length) {
            sum += nums[end];
            System.out.println("sum+:" + sum);

            while (sum >= s) {
                System.out.println("sum:" + sum);

                if ((end - start + 1) < count) {
                    count = end - start + 1 ;
                    System.out.println("count:" + count);
                }
                sum -= nums[start];
                System.out.println("sum-:" + sum);
                start++;
            }
            end++;
        }
        return count < Integer.MAX_VALUE ? count : 0;

    }

    public static void main(String[] args) {
        int s = 10;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println("end count:" + MinSubArrayLen.minSubArrayLen(s, nums));
    }
}
