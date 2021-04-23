package com.hhj.leetcode;

import java.util.Arrays;

public class MaximumProduct {
    /**
     * 首先将数组排序。
     * 如果数组中全是非负数，则排序后最大的三个数相乘即为最大乘积；
     * 如果全是非正数，则最大的三个数相乘同样也为最大乘积。
     * 如果数组中有正数有负数，则最大乘积既可能是三个最大正数的乘积，也可能是两个最小负数（即绝对值最大）与最大正数的乘积。
     */
    public static int maximumProduct(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        int l = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[l - 1], nums[l - 1] * nums[l - 2] * nums[l - 3]);
    }
    /**
     * 我们实际上只要求出数组中最大的三个数以及最小的两个数，因此我们可以不用排序，用线性扫描直接得出这五个数。
     */
    public static int maximumProduct2(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }

            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }


    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{1, 2, 3}));
        System.out.println(maximumProduct(new int[]{1, 2, 3, 4}));
        System.out.println(maximumProduct(new int[]{-1, -2, -3}));
        System.out.println(maximumProduct(new int[]{-100, -98, -1, 2, 3, 4}));
        System.out.println(maximumProduct(new int[]{-100, 0, 1, 2, 3, 4}));
        System.out.println(maximumProduct(new int[]{-2, -1, 1, 2, 3, 4}));

        System.out.println("--------------------");

        System.out.println(maximumProduct2(new int[]{1, 2, 3}));
        System.out.println(maximumProduct2(new int[]{1, 2, 3, 4}));
        System.out.println(maximumProduct2(new int[]{-1, -2, -3}));
        System.out.println(maximumProduct2(new int[]{-100, -98, -1, 2, 3, 4}));
        System.out.println(maximumProduct2(new int[]{-100, 0, 1, 2, 3, 4}));
        System.out.println(maximumProduct2(new int[]{-2, -1, 1, 2, 3, 4}));
    }
}
