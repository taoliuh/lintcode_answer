/**
 * Recover Rotated Sorted Array
 * Given a rotated sorted array, recover it to sorted array in-place.
 *
 * Challenge
 * In-place, O(1) extra space and O(n) time.
 *
 * Created by liutao on 9/5/15.
 */
public class Solution {
    public void recoverRotatedSortedArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int start = 0;
        int end = array.length - 1;
        int mid;
        int peak;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] < array[end]) {
                end = mid;
            } else if (array[mid] > array[end]) {
                start = mid;
            } else {
                --end;
            }
        }
        if (array[start] < array[end]) {
            peak = start;
        } else {
            peak = end;
        }
        rotate(array, 0, peak - 1);
        rotate(array, peak, array.length - 1);
        rotate(array, 0, array.length - 1);
    }

    private void rotate(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            ++left;
            --right;
        }
    }
}
