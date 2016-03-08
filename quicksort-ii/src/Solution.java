/**
 * Created by liutao on 2/24/16.
 */
public class Solution {
    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[right];
        int low = left;
        int high = right - 1;
        while (low < high) {
            while (array[low] < pivot && low < high) {
                ++low;
            }
            while (array[high] >= pivot && low < high) {
                --high;
            }
            swap(array, low, high);
        }
        if (array[low] >= array[right]) {
            swap(array, low, right);
        } else {
            ++low;
        }
        quickSort(array, left, low - 1);
        quickSort(array, low + 1, right);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
