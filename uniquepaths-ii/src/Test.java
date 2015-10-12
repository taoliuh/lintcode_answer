/**
 * Created by liutao on 10/12/15.
 */
public class Test {
    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        Solution solution = new Solution();
        int result = solution.uniquePathsWithObstacles(grid);
        System.out.printf("Result is %d", result);
    }
}
