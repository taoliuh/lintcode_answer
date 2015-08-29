/**
 *
 * Find Minimum in Rotated Sorted Array
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * Find the minimum element.
 *
 * Created by liutao on 8/29/15.
 */
public class Solution {
    public int findMinimum(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] < array[end]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (array[start] < array[end]) {
            return array[start];
        } else {
            return array[end];
        }
    }
}
