/**
 * Search a 2D Matrix II
 * Write an efficient algorithm that searches for a value in an m x n matrix, return the occurrence of it.
 *
 * This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 *
 * Integers in each column are sorted from up to bottom.
 *
 * No duplicate integers in each row or column.
 *
 * Created by liutao on 8/28/15.
 */
public class Solution {
    public int searchMatrix(int[][] matrix, int target) {
        int occurrence = 0;
        if (matrix == null || matrix.length == 0) {
            return occurrence;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return occurrence;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int rowIndex = row - 1;
        int columnIndex = 0;
        if (matrix[0][0] > target || matrix[row - 1][column - 1] < target) {
            return occurrence;
        }
        while (rowIndex >= 0 && columnIndex < column) {
            int num = matrix[rowIndex][columnIndex];
            if (num == target) {
                ++occurrence;
                --rowIndex;
            } else if (num < target) {
                ++columnIndex;
            } else {
                --rowIndex;
            }
        }
        return occurrence;
    }
}
