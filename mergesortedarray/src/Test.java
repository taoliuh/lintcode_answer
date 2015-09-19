/**
 * Created by liutao on 9/19/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[] {1, 4, 8, 13, 29, 0, 0, 0, 0};
        int[] b = new int[] {3, 5, 33, 39};
        Solution solution = new Solution();
        solution.mergeSortedArray(a, 5, b, 4);
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.printf("%d\n", a[i]);
            } else {
                System.out.printf("%d, ", a[i]);
            }
        }
    }
}
