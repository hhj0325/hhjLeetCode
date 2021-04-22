package com.hhj.leetcode;

/**
 * https://leetcode-cn.com/problems/max-consecutive-ones/
 * <p>
 * 给定一个二进制数组， 计算其中最大连续 1 的个数。
 * 示例：
 * 输入：[1,1,0,1,1,1] 输出：3
 * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
 */
public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                cur++;
            } else {
                if (cur > max) {
                    max = cur;
                }
                cur = 0;
            }
        }
        if (cur > max) {
            max = cur;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(FindMaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
