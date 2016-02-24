/**
 * Created by liutao on 2/24/16.
 */
public class Solution {

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int storedIndex = left;
        for (int i = left; i < right; i++) {
            if (array[i] < pivot) {
                swap(array, storedIndex, i);
                ++storedIndex;
            }
        }
        swap(array, storedIndex, right);
        return storedIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
