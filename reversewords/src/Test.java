/**
 * Created by liutao on 9/5/15.
 */
public class Test {
    public static void main(String[] args) {
        String s = "  the  sky is blue  ";
        Solution solution = new Solution();
        String result = solution.reverseWords(s);
        System.out.printf("Result is %s", result);
    }
}
