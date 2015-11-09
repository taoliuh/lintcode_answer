/**
 * Created by liutao on 11/9/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 4, 5, 3, 7, 1};
        Solution solution = new Solution();
        int result = solution.longestIncreasingSubsequence(array);
        System.out.printf("Result is %s", result);
    }
}
