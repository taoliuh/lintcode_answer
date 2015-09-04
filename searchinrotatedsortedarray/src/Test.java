/**
 * Created by liutao on 9/4/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 2, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1};
        Solution solution = new Solution();
        int index = solution.find(array, -9);
        System.out.printf("Index is %d", index);
    }
}
