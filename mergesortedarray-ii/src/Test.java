import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liutao on 9/19/15.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] a = new Integer[] {3, 5, 33, 39};
        Integer[] b = new Integer[] {1, 4, 8, 13, 29};
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.addAll(Arrays.asList(a));
        ArrayList<Integer> b1 = new ArrayList<>();
        b1.addAll(Arrays.asList(b));
        Solution solution = new Solution();
        ArrayList<Integer> result = solution.mergeSortedArray(a1, b1);
        System.out.printf("Result is %s", result.toString());
    }
}
