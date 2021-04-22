package com.hhj.leetcode;

import org.omg.CORBA.WrongTransactionHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/summary-ranges/
 * <p>
 * 给定一个无重复元素的有序整数数组 nums 。
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。
 * 也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 * <p>
 * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
 * "a->b" ，如果 a != b
 * "a" ，如果 a == b
 * <p>
 * 示例 1：
 * 输入：nums = [0,1,2,4,5,7] 输出：["0->2","4->5","7"]
 * 解释：区间范围是：[0,2] --> "0->2" [4,5] --> "4->5" [7,7] --> "7"
 * <p>
 * 示例 2：
 * 输入：nums = [0,2,3,4,6,8,9] 输出：["0","2->4","6","8->9"]
 * 解释：区间范围是：[0,0] --> "0" [2,4] --> "2->4" [6,6] --> "6" [8,9] --> "8->9"
 * <p>
 * 示例 3：
 * 输入：nums = [] 输出：[]
 * <p>
 * 示例 4：
 * 输入：nums = [-1] 输出：["-1"]
 * <p>
 * 示例 5：
 * 输入：nums = [0] 输出：["0"]
 */

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> retList = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return retList;
        } else if (nums.length == 1) {
            retList.add(String.valueOf(nums[0]));
            return retList;
        } else {
            int left = 0;
            int cur = 0;
            int right = 1;
            StringBuilder sb = new StringBuilder();
            while ( cur < nums.length) {
                // 连续
                if (nums[cur] + 1 == nums[right]) {
                    // 空的
                    if (sb.length() == 0) {
                        sb.append(nums[left]).append("->");
                    }
                }
                // 不连续
                else {
                    if (sb.length() == 0) {
                        retList.add(String.valueOf(nums[left]));
                    } else {
                        sb.append(nums[cur]);
                        retList.add(sb.toString());
                        // 清空sb
                        sb = new StringBuilder();
                    }
                    left = right;
                }
                cur++;
                //
                if(right < nums.length -1){
                    right++;
                }
            }
            return retList;
        }

    }

    public static void main(String[] args) {
        System.out.println(SummaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(SummaryRanges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
        // System.out.println(SummaryRanges.summaryRanges(new int[]{}));
        // System.out.println(SummaryRanges.summaryRanges(new int[]{-1}));
        // System.out.println(SummaryRanges.summaryRanges(new int[]{0}));
    }
}
