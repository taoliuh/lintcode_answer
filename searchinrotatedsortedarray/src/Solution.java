/**
 * Search in Rotated Sorted Array
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 * Created by liutao on 9/4/15.
 */
public class Solution {

    public int find(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        int mid;
        boolean findMin = target <= array[end];
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < array[end]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (findMin) {
            if (array[end] < array[start]) {
                start = end;
            }
            end = array.length - 1;
        } else {
            if (array[start] < array[end]) {
                end = start - 1;
            } else {
                --end;
            }
            start = 0;
        }
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (array[start] == target) {
            return start;
        }
        if (array[end] == target) {
            return end;
        }
        return -1;
    }
}
