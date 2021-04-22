package com.hhj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * <p>
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * 输入:[4,3,2,7,8,2,3,1]
 * 输出:[5,6]
 */

public class FindDisappearedNumbers {
    /**
     * 索引1-n位置上的数字，打标为负数。
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        for (int num : nums) {
            if(num < 0){
                num = num * -1;
            }
            if (nums[num - 1] > 0) {
                nums[num - 1] = nums[num - 1] * -1;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ret.add(i + 1);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(FindDisappearedNumbers.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));

    }
}
