package com.hhj.leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/contains-duplicate-ii/
 * <p>
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
 * 使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 * <p>
 * 示例 1:
 * 输入: nums = [1,2,3,1], k = 3  输出: true
 * <p>
 * 示例 2:
 * 输入: nums = [1,0,1,1], k = 1  输出: true
 * <p>
 * 示例 3:
 * 输入: nums = [1,2,3,1,2,3], k = 2  输出: false
 */

public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j <= k; j++) {
                if (i + j < nums.length && nums[i] == nums[i + j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ContainsDuplicate2.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(ContainsDuplicate2.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(ContainsDuplicate2.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));


        System.out.println(ContainsDuplicate2.containsNearbyDuplicate2(new int[]{1, 2, 3, 1}, 3));
        System.out.println(ContainsDuplicate2.containsNearbyDuplicate2(new int[]{1, 0, 1, 1}, 1));
        System.out.println(ContainsDuplicate2.containsNearbyDuplicate2(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
