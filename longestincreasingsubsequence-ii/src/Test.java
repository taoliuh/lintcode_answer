/**
 * Created by liutao on 3/14/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 4, 5, 3, 7};
        Solution solution = new Solution();
        int[] result = solution.longestIncreasingSubsequence(array);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
