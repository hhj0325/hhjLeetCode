package com.hhj.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。
 * 因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
 * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
 * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 * <p>
 * 示例 1：
 * 输入：A = [1,1], B = [2,2] 输出：[1,2]
 * <p>
 * 示例 2：
 * 输入：A = [1,2], B = [2,3] 输出：[1,2]
 * <p>
 * 示例 3：
 * 输入：A = [2], B = [1,3] 输出：[2,3]
 * <p>
 * 示例 4：
 * 输入：A = [1,2,5], B = [2,4] 输出：[5,4]
 */

public class FairCandySwap {
    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] ret = new int[2];
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int z = (sumA - sumB) / 2;
        Set<Integer> setA = new HashSet<>();
        for (int tmp : A) {
            setA.add(tmp);
        }
        for(int i=0; i<B.length;i++){
            if(setA.contains(z + B[i])){
                ret[0] =z + B[i];
                ret[1] = B[i];
                return ret;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1, 2}, new int[]{2, 3})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{2}, new int[]{1, 3})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4})));

    }
}
