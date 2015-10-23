/**
 * Search in a Big Sorted Array
 *
 * Given a big sorted array, find the first index of a target number.
 * Your algorithm should be in O(log k), where k is the first index of the target number.
 *
 * Return -1, if the number doesn't exist in the array.
 *
 * Created by liutao on 10/23/15.
 */
public class Solution {
    public int searchBigSortedArray(int[] a, int target) {
        if (a == null || a.length == 0) {
            return -1;
        }
        int start = 0;
        int end = a.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (a[mid] == target) {
                end = mid;
            } else if (a[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (a[start] == target) {
            return start;
        }
        if (a[end] == target) {
            return end;
        }
        return -1;
    }
}
