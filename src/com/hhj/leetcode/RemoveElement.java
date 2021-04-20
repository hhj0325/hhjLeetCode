package com.hhj.leetcode;

/**
 * https://leetcode-cn.com/problems/remove-element/
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 1：
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2]
 * <p>
 * 示例 2：
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 */


public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] num1 = {3, 2, 2, 3};
        int len1 = re.removeElement(num1, 3);
        System.out.println("len1=" + len1);
        for (int i = 0; i < len1; i++) {
            System.out.print(num1[i] + ",");
        }

        int[] num2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int len2 = re.removeElement(num2, 2);
        System.out.println("");
        System.out.println("len2=" + len2);
        for (int i = 0; i < len2; i++) {
            System.out.print(num2[i] + ",");
        }


    }
}
