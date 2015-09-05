/**
 * Created by liutao on 9/5/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[] {4, 9, 1, 2, 3, 3, 3};
        Solution solution = new Solution();
        solution.recoverRotatedSortedArray(array);
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
