/**
 * Created by liutao on 11/10/15.
 */
public class Test {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "EACB";
        Solution solution = new Solution();
        int result = solution.longestCommonSubsequence(a, b);
        System.out.printf("Result is %s", result);
    }
}
