/**
 * Created by liutao on 2/24/16.
 */
public class Solution {
    public static void mergeSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        int[] reg = new int[length];
        mergeSortRecursive(array, reg, 0, length - 1);
    }

    private static void mergeSortRecursive(int[] array, int[] reg, int start, int end) {
        if (start >= end) {
            return;
        }
        int len = end - start;
        int mid = (len >> 1) + start;
        int start1 = start;
        int end1 = mid;
        int start2 = mid + 1;
        int end2 = end;
        mergeSortRecursive(array, reg, start1, end1);
        mergeSortRecursive(array, reg, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            reg[k++] = array[start1] < array[start2] ? array[start1++] : array[start2++];
        }
        while (start1 <= end1) {
            reg[k++] = array[start1++];
        }
        while (start2 <= end2) {
            reg[k++] = array[start2++];
        }
        for (k = start; k <= end; k++) {
            array[k] = reg[k];
        }
    }
}
