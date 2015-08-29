/**
 *
 * Find Minimum in Rotated Sorted Array II
 *
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 2 5 6 7 might become 5 6 7 0 1 2 2).
 *
 * Find the minimum element.
 *
 * The array may contain duplicates.
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
            } else if (array[mid] > array[end]) {
                start = mid;
            } else {
                --end;
            }
        }
        if (array[start] < array[end]) {
            return array[start];
        } else {
            return array[end];
        }
    }
}
