/**
 * Minimum Path Sum
 *
 * Given a m x n grid filled with non-negative numbers, find a path
 * from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note
 * You can only move either down or right at any point in time.
 *
 * Created by liutao on 10/12/15.
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }
        int rowSize = grid.length;
        int columnSize = grid[0].length;
        int[][] result = new int[rowSize][columnSize];
        result[0][0] = grid[0][0];
        for (int i = 1; i < rowSize; i++) {
            result[i][0] = result[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < columnSize; j++) {
            result[0][j] = result[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < rowSize; i++) {
            for (int j = 1; j < columnSize; j++) {
                result[i][j] = Math.min(result[i][j - 1], result[i - 1][j]) + grid[i][j];
            }
        }
        return result[rowSize - 1][columnSize - 1];
    }
}
