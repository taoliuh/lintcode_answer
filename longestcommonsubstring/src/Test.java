/**
 * Created by liutao on 11/10/15.
 */
public class Test {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "EBCB";
        Solution solution = new Solution();
        int result = solution.longestCommonSubstring(a, b);
        System.out.printf("Result is %s", result);
    }
}
