//867. https://leetcode.com/problems/transpose-matrix/
package net.tutort.learn.d0710.asgmt;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        //int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    private static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] matrixT = new int[n][m];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    matrixT[j][i] = matrix[i][j];
            }
        }
        return matrixT;
    }
}
