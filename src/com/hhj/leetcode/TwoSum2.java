package com.hhj.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * <p>
 * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，
 * 所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * <p>
 * 示例 1：
 * 输入：numbers = [2,7,11,15], target = 9 输出：[1,2]
 * 解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * <p>
 * 示例 2：
 * 输入：numbers = [2,3,4], target = 6 输出：[1,3]
 * <p>
 * 示例 3：
 * 输入：numbers = [-1,0], target = -1 输出：[1,2]
 */
public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (sumMap.get(target - numbers[i]) != null) {
                ret[0] = sumMap.get(target - numbers[i]) + 1;
                ret[1] = i + 1;
                return ret;
            }
            sumMap.put(numbers[i], i);
        }
        return ret;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int[] ret = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int tmp = numbers[left] + numbers[right];
            if (tmp > target) {
                right--;
            } else if (tmp < target) {
                left++;
            } else {
                ret[0] = left + 1;
                ret[1] = right + 1;
                return ret;
            }

        }
        return ret;


    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum2.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(TwoSum2.twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(TwoSum2.twoSum(new int[]{-1, 0}, -1)));

        System.out.println(Arrays.toString(TwoSum2.twoSum2(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(TwoSum2.twoSum2(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(TwoSum2.twoSum2(new int[]{-1, 0}, -1)));

    }
}
