/**
 * Created by liutao on 2/24/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 4, 2};
        Solution.insertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
