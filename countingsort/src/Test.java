/**
 * Created by liutao on 3/13/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] result = Solution.countSort(a, 9);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
