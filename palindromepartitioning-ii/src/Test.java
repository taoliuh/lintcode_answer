/**
 * Created by liutao on 10/19/15.
 */
public class Test {
    public static void main(String[] args) {
        String s = "abaasdaddaabaggaggsas";
        Solution solution = new Solution();
        int result = solution.minCut(s);
        System.out.printf("Result is %d", result);
    }
}
