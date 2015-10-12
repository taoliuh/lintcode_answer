/**
 * Created by liutao on 10/12/15.
 */
public class Test {
    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {1, 7, -6, 3},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4},
                {5, 5, 5, 5}
        };
        Solution solution = new Solution();
        int result = solution.minPathSum(grid);
        System.out.printf("Result is %d", result);
    }
}
