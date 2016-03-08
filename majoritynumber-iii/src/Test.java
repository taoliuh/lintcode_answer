import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liutao on 3/8/16.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] a = {2,2,5,1};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(a));
        Solution solution = new Solution();
        int result = solution.majorityNumber(nums, 3);
        System.out.print(result);
    }
}
