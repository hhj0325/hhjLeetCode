package com.hhj.leetcode;

import java.util.Arrays;

public class CommonUtils {
    public static void printMatrix(int[][] ret1) {
        for (int[] sub : ret1) {
            System.out.println(Arrays.toString(sub));
        }

    }

    public static void printArray(int[] ret1) {
        System.out.println(Arrays.toString(ret1));
    }
}
