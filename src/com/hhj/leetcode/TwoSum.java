package com.hhj.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        if(nums.length > 1){
            for(int i = 0 ; i < nums.length - 1 ; i ++){
                for(int j = i + 1; j < nums.length; j++ ){
                    if(target == nums[i] + nums[j]){
                        ret[0] = nums[i];
                        ret[1] = nums[j];
                        return ret;
                    }
                }

            }

        }
        return ret;
    }

    public static void main(String[] args) {
        int[] in1 = {1, 2, 9, 8, 7};
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 9)));
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 10)));
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 17)));
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 16)));
        System.out.println(Arrays.toString(TwoSum.twoSum(in1, 20)));
    }

}
