package com.hhj.leetcode;

/**
 * 给定一个整数数组 arr，如果它是有效的山脉数组就返回 true，否则返回 false。
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 * 1、arr.length >= 3
 * 2、在 0 < i < arr.length - 1 条件下，存在 i 使得：
 * ·arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * ·arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 */

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }
        if (arr[0] >= arr[1]) {
            return false;
        }
        boolean up = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
            if (up) {
                if (arr[i] > arr[i + 1]) {
                    up = false;
                }
            }
            if (!up) {
                if (arr[i] < arr[i + 1]) {
                    return false;

                }
            }
        }
        if (up) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2, 1}));
        System.out.println(validMountainArray(new int[]{3, 5, 5}));
        System.out.println(validMountainArray(new int[]{0, 3, 2, 1}));
        System.out.println(validMountainArray(new int[]{0, 2, 3, 4, 5, 2, 1, 0}));
        System.out.println(validMountainArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));

    }
}
