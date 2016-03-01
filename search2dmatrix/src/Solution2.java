/**
 * Search a 2D Matrix
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 *
 * This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 *
 * example
 * [
 *  [1, 3, 5, 7],
 *  [10, 11, 16, 20],
 *  [23, 30, 34, 50]
 * ]
 *
 * Created by liutao on 8/28/15.
 */
public class Solution2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int start = 0;
        int end = row * column - 1;
        int mid;
        while (start + 1 < end) {
            mid = (end - start) / 2 + start;
            if (matrix[mid / column][mid % column] == target) {
                return true;
            } else if (matrix[mid / column][mid % column] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (matrix[start / column][start % column] == target) {
            return true;
        }
        if (matrix[end / column][end % column] == target) {
            return true;
        }
        return false;
    }

}
