/**
 * Created by liutao on 2/24/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {13, 14, 94, 33, 82, 25, 59, 94, 65, 23, 45, 27, 73, 25, 39, 10};
        Solution.mergeSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
