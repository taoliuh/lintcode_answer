/**
 * Created by liutao on 10/23/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[] {3, 6, 6, 7, 7, 7, 9, 10, 111};
        Solution solution = new Solution();
        int position = solution.searchBigSortedArray(a, 7);
        System.out.printf("Position is %d", position);
    }
}
