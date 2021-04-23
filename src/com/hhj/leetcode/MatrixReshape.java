package com.hhj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/reshape-the-matrix/solution/zhong-su-ju-zhen-by-leetcode-solution-gt0g/
 * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 *
 * 示例 1:
 * 输入: nums = [[1,2], [3,4]] r = 1, c = 4
 * 输出: [[1,2,3,4]]
 * 解释:行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。
 *
 * 示例 2:
 * 输入: nums = [[1,2], [3,4]] r = 2, c = 4
 * 输出: [[1,2], [3,4]]
 * 解释:没有办法将 2 * 2 矩阵转化为 2 * 4 矩阵。 所以输出原矩阵。
 */
public class MatrixReshape {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c > nums.length * nums[0].length) {
            return nums;
        }
        int[][] ret = new int[r][c];
        int tr = 0, tc = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                ret[tr][tc] = nums[i][j];
                tc++;
                if (tc == c) {
                    tc = 0;
                    tr++;
                }
            }
        }

        return ret;
    }

    public static int[][] matrixReshape2(int[][] nums, int r, int c) {
        if (r * c > nums.length * nums[0].length) {
            return nums;
        }
        int[][] ret = new int[r][c];
        for (int x = 0; x < r * c; ++x) {
            ret[x / c][x % c] = nums[x / nums.length][x % nums[0].length];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] ret1 = MatrixReshape.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
        int[][] ret2 = MatrixReshape.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4);
        printOut(ret1);
        printOut(ret2);

        int[][] ret3 = MatrixReshape.matrixReshape2(new int[][]{{1, 2}, {3, 4}}, 1, 4);
        int[][] ret4 = MatrixReshape.matrixReshape2(new int[][]{{1, 2}, {3, 4}}, 2, 4);
        printOut(ret3);
        printOut(ret4);

    }

    private static void printOut(int[][] ret1) {
        for (int[] sub : ret1) {
            System.out.print(Arrays.toString(sub) + ",");
        }
        System.out.println();

    }
}
