/**
 * Created by liutao on 2/24/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {2,2,5,1};
        Solution.quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
