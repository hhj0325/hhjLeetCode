package com.hhj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/merge-sorted-array/
 * <p>
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 * <p>
 * 示例 1：
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3  输出：[1,2,2,3,5,6]
 * <p>
 * 示例 2：
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0  输出：[1]
 */
public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[i - m];
            }
        }
        Arrays.sort(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int cur;
        int[] alls = new int[m + n];
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] <= nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            alls[p1 + p2 - 1] = cur;
        }
        for(int i=0;i< nums1.length;i++){
            nums1[i] = alls[i];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums11 = new int[]{1};
        MergeTwoSortedArray.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        MergeTwoSortedArray.merge(nums11, 1, new int[]{}, 0);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums11));

        int[] nums2 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums22 = new int[]{1};
        MergeTwoSortedArray.merge2(nums2, 3, new int[]{2, 5, 6}, 3);
        MergeTwoSortedArray.merge2(nums22, 1, new int[]{}, 0);
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums22));

    }
}
