/**
 * Created by liutao on 8/29/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 2, 2, 5, 6, 7};
        Solution solution = new Solution();
        int minimum = solution.findMinimum(array);
        System.out.printf("Minimum is %d", minimum);
    }
}
