package com.hhj.leetcode;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * 输入: [1,3,5,6], 5 输出: 2
 * <p>
 * 示例 2:
 * 输入: [1,3,5,6], 2 输出: 1
 * <p>
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7 输出: 4
 * <p>
 * 示例 4:
 * 输入: [1,3,5,6], 0 输出: 0
 */

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int right = 1;
        for (int left = 0; left < nums.length; left++, right++) {
            if (nums[left] >= target) {
                return left;
            }
            if (nums[left] < target) {
                if (right >= nums.length) {
                    return right;
                }
                if (nums[right] > target) {
                    return right;

                }
            }
        }
        return 0;
    }

    public static int searchInsert2(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(target <= nums[mid]){
                ans = mid;
                right= mid -1;
            }
            else {
                left = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 0));


        System.out.println(SearchInsert.searchInsert2(new int[]{1, 3, 5, 6}, 5));
        System.out.println(SearchInsert.searchInsert2(new int[]{1, 3, 5, 6}, 2));
        System.out.println(SearchInsert.searchInsert2(new int[]{1, 3, 5, 6}, 7));
        System.out.println(SearchInsert.searchInsert2(new int[]{1, 3, 5, 6}, 0));

    }
}
