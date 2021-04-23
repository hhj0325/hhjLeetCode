package com.hhj.leetcode;

public class DominantIndex {
    public static int dominantIndex(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > max1) {
                max2 = max1;
                max1 = num;
                index = i;
            } else if (num > max2) {
                max2 = num;
            }
        }

        if ((max1 > 0 && max2 == 0) || (max1 / max2 >= 2)) {
            return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3, 6, 1, 0}));
        System.out.println(dominantIndex(new int[]{1, 2, 3, 4}));
    }
}
