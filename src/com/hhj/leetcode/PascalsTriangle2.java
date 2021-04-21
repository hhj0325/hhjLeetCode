package com.hhj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/pascals-triangle-ii/
 * <p>
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * 输入: 3 输出: [1,3,3,1]
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 */
public class PascalsTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> subList = new ArrayList<>(i + 1);
            for (int j = 0; j < i + 1; j++) {
                int left = j - 1;
                int right = j;
                if (left < 0 || right >= i) {
                    subList.add(1);
                } else {
                    subList.add(pre.get(left) + pre.get(right));
                }
            }
            pre = subList;
        }
        return pre;

    }

    public static void main(String[] args) {
        System.out.println(PascalsTriangle2.getRow(3));
    }
}
