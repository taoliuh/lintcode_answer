import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liutao on 10/10/15.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{3})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{3, 4})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{6, 9 , 5})));
        input.add(new ArrayList<>(Arrays.asList(new Integer[]{4, 1, 8, 3})));
        Solution solution = new Solution();
        int result = solution.minimumTotal(input);
        System.out.printf("Result is %d", result);
    }
}
