/**
 * Created by liutao on 9/1/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[] {6, 8, 9};
        int[] b = new int[] {1, 2, 3, 4, 5};
        Solution solution = new Solution();
        double median = solution.findMedian(a, b);
        System.out.printf("Median is %.1f", median);
    }
}
