/**
 *
 * Follow up for "Unique Paths":
 *
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 *
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * Created by liutao on 10/12/15.
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        int rowSize = obstacleGrid.length;
        int columnSize = obstacleGrid[0].length;
        int[][] result = new int[rowSize][columnSize];
        boolean obstacle = false;
        for (int i = 0; i < rowSize; i++) {
            if (obstacleGrid[i][0] == 1) {
                obstacle = true;
            }
            result[i][0] = (obstacle ? 0 : 1);
        }
        obstacle = false;
        for (int j = 0; j < columnSize; j++) {
            if (obstacleGrid[0][j] == 1) {
                obstacle = true;
            }
            result[0][j] = (obstacle ? 0 : 1);
        }
        for (int i = 1; i < rowSize; i++) {
            for (int j = 1; j < columnSize; j++) {
                if (obstacleGrid[i][j] == 1 || result[i - 1][j] == 0 && result[i][j - 1] == 0) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }
            }
        }
        return result[rowSize - 1][columnSize - 1];
    }
}
