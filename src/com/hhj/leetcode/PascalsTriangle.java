package com.hhj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/pascals-triangle/
 * <p>
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> retList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>(i + 1);
            for (int j = 0; j < i + 1; j++) {
                int left = j - 1;
                int right = j;
                if (left < 0 || right >= i) {
                    subList.add(1);
                } else {
                    subList.add(retList.get(i - 1).get(left) + retList.get(i - 1).get(right));

                }
            }
            retList.add(subList);
        }
        return retList;

    }

    public static void main(String[] args) {
        System.out.println(PascalsTriangle.generate(5));
        System.out.println(PascalsTriangle.generate(1));
        System.out.println(PascalsTriangle.generate(0));

    }


}
