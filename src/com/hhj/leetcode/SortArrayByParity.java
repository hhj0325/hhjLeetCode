package com.hhj.leetcode;

import java.util.Arrays;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 *
 * 示例：
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int l = 0, r = A.length - 1;
        int tmp;
        while (l <= r) {
            if (A[l] % 2 != 0) {
                tmp = A[r];
                A[r] = A[l];
                A[l] = tmp;
                r--;
            } else {
                l++;
            }
        }
        return A;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));

    }
}
