import java.util.HashSet;

/**
 * Created by liutao on 10/20/15.
 */
public class Test {
    public static void main(String[] args) {
        String s = "datalintcodealgorithm";
        HashSet<String> set = new HashSet<>();
        set.add("lintcode");
        set.add("algorithm");
        set.add("data");
        Solution solution = new Solution();
        boolean result = solution.wordBreak(s, set);
        System.out.printf("Result is %s", result);
    }
}
