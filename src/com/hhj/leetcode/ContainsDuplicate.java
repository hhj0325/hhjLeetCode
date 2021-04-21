package com.hhj.leetcode;

import sun.net.www.protocol.http.HttpURLConnection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/contains-duplicate/
 * <p>
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * <p>
 * 示例 1:
 * 输入: [1,2,3,1] 输出: true
 * <p>
 * 示例 2:
 * 输入: [1,2,3,4] 输出: false
 * <p>
 * 示例 3:
 * 输入: [1,1,1,3,3,4,3,2,4,2] 输出: true
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num:nums){
            if(numSet.contains(num)){
                return true;
            }
            numSet.add(num);
        }
        return false;

    }

    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(ContainsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));

        System.out.println(ContainsDuplicate.containsDuplicate2(new int[]{1,2,3,1}));
        System.out.println(ContainsDuplicate.containsDuplicate2(new int[]{1,2,3,4}));
        System.out.println(ContainsDuplicate.containsDuplicate2(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
