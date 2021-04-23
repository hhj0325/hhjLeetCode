package com.hhj.leetcode;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int left = 0, right = 0;
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        if(right == 0){
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            left += nums[i-1];
            right -= nums[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{1, 2, 3}));
        System.out.println(pivotIndex(new int[]{2, 1, -1}));
    }

}
