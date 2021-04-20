package com.hhj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/plus-one/
 * <p>
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1：
 * 输入：digits = [1,2,3] 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * <p>
 * 示例 2：
 * 输入：digits = [4,3,2,1] 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * <p>
 * 示例 3：
 * 输入：digits = [9] 输出：[1,0]
 */

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(PlusOne.plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(PlusOne.plusOne(new int[]{9})));
        System.out.println(Arrays.toString(PlusOne.plusOne(new int[]{9, 9})));
    }

}
