/**
 * Created by liutao on 8/29/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[] {4, 7, 9, 0, 2, 3};
        Solution solution = new Solution();
        int minimum = solution.findMinimum(array);
        System.out.printf("Minimum is %d", minimum);
    }
}
