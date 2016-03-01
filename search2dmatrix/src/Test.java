/**
 * Created by liutao on 8/28/15.
 */
public class Test {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 3, 5, 7},{10, 11, 16, 20}, {23, 30, 34, 50}};
        Solution solution = new Solution();
        boolean result = Solution2.searchMatrix(matrix, 50);
        System.out.printf("result is %b", result);
    }
}
