package com.hhj.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 * <p>
 * 示例 1：
 * 输入：A = [1,2,0,0], K = 34 输出：[1,2,3,4]
 * 解释：1200 + 34 = 1234
 * <p>
 * 示例 2：
 * 输入：A = [2,7,4], K = 181 输出：[4,5,5]
 * 解释：274 + 181 = 455
 * <p>
 * 示例 3：
 * 输入：A = [2,1,5], K = 806 输出：[1,0,2,1]
 * 解释：215 + 806 = 1021
 * <p>
 * 示例 4：
 * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * 输出：[1,0,0,0,0,0,0,0,0,0,0]
 * 解释：9999999999 + 1 = 10000000000
 */

public class AddToArrayForm {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ret = new LinkedList<>();
        int z = 0, tmpK = k;
        for (int i = num.length - 1; i >= 0 || tmpK > 0; i--) {
            int sum = 0;
            if (i >= 0) {
                sum = num[i] + tmpK % 10 + z;
            } else {
                sum = tmpK % 10 + z;
            }
            int last = sum % 10;
            ret.addFirst(last);
            z = sum / 10;
            tmpK = tmpK / 10;
        }
        if (z == 1) {
            ret.addFirst(1);
        }
        return ret;

    }

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1, 2, 0, 0}, 34));
        System.out.println(addToArrayForm(new int[]{2, 7, 4}, 181));
        System.out.println(addToArrayForm(new int[]{2, 1, 5}, 806));
        System.out.println(addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
        System.out.println(addToArrayForm(new int[]{0}, 233));

    }
}
