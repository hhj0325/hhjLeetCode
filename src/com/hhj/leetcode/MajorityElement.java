package com.hhj.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/majority-element/
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1：
 * 输入：[3,2,3] 输出：3
 *
 * 示例 2：
 * 输入：[2,2,1,1,1,2,2] 输出：2
 */

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0 ;i< nums.length;i++){
            if(countMap.get(nums[i]) == null){
                countMap.put(nums[i],1);
            }
            else {
                countMap.put(nums[i], countMap.get(nums[i])+1);
            }
        }
        for(Integer key: countMap.keySet()){
            if(countMap.get(key) > nums.length/2){
                return key;
            }
        }
        return 0;

    }

    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    public static void main(String[] args) {
        System.out.println(MajorityElement.majorityElement(new int[]{3,2,3}));
        System.out.println(MajorityElement.majorityElement(new int[]{2,2,1,1,1,2,2}));

        System.out.println(MajorityElement.majorityElement2(new int[]{3,2,3}));
        System.out.println(MajorityElement.majorityElement2(new int[]{2,2,1,1,1,2,2}));
    }

}
