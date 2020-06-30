package com.hhj.leetcode;

/**
 * @author huhaojian
 * @date 2020/6/30 003019:32
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int i = 0;
        for(int j = 1 ; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i +1;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = obj.removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
}
