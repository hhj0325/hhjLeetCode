package com.hhj.leetcode;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/third-maximum-number/
 * <p>
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 * <p>
 * 示例 1：
 * 输入：[3, 2, 1] 输出：1
 * 解释：第三大的数是 1 。
 * <p>
 * 示例 2：
 * 输入：[1, 2] 输出：2
 * 解释：第三大的数不存在, 所以返回最大的数 2 。
 * <p>
 * 示例 3：
 * 输入：[2, 2, 3, 1] 输出：1
 * 解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
 * 此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1 。
 */
public class ThirdMax {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> numSet = new TreeSet<>();
        for (int num : nums) {
            numSet.add(num);
            if (numSet.size() > 3) {
                numSet.remove(numSet.first());
            }
        }
        return numSet.size() >= 3 ? numSet.first() : numSet.last();
    }

    public static void main(String[] args) {
        System.out.println(ThirdMax.thirdMax(new int[]{3, 2, 1}));
        System.out.println(ThirdMax.thirdMax(new int[]{1, 2}));
        System.out.println(ThirdMax.thirdMax(new int[]{2, 2, 3, 1}));
        System.out.println(ThirdMax.thirdMax(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1, 1, 1}));
    }
}
