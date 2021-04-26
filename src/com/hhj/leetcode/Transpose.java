package com.hhj.leetcode;

/**
 *
 */
public class Transpose {
    public static int[][] transpose(int[][] matrix) {
        int[][] ret = new int[matrix[0].length][matrix.length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ret[j][i]= matrix[i][j];
            }
        }
        return ret;

    }

    public static void main(String[] args) {
        CommonUtils.printMatrix(transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        CommonUtils.printMatrix(transpose(new int[][]{{1,2,3},{4,5,6}}));
    }
}
