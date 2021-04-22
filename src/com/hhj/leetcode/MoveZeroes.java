package com.hhj.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 说明:必须在原数组上操作，不能拷贝额外的数组。尽量减少操作次数。
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        // 0的个数
        int index = 0;
        // 从尾部开始
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for(int i = index; i< nums.length;i++){
            nums[i] = 0;
        }
        Set<Integer> numSet = new TreeSet<>();
        numSet.add(1);

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
