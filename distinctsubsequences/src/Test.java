/**
 * Created by liutao on 11/14/15.
 */
public class Test {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        Solution solution = new Solution();
        int result = solution.numDistinct(s, t);
        System.out.printf("Result is %s", result);
    }
}
