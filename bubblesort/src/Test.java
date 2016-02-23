/**
 * Created by liutao on 2/23/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {6, 5, 3, 1, 8, 7, 2, 4};
        Solution solution = new Solution();
        int[] result = solution.bubbleSort(a);
        for (int d : result) {
            System.out.print(d + " ");
        }
    }
}
