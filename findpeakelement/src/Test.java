/**
 * Created by liutao on 8/29/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] elements = new int[] {2, 4, 5, 5, 8, 2, 3, 1};
        Solution solution = new Solution();
        int peakElementPosition = solution.findPeakElement(elements);
        System.out.printf("Peak element position %d", peakElementPosition);
    }
}
