import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liutao on 3/8/16.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] a = {7, 1, 7, 7, 61, 61, 61, 10, 10, 10, 61};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(a));
        Solution3 solution = new Solution3();
        int result = solution.majorityNumber(nums, 3);
        System.out.print(result);
    }
}
