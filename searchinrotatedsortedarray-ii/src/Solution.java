/**
 * Search in Rotated Sorted Array II
 *
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 *
 * Would this affect the run-time complexity? How and why?
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
            } else if (array[mid] > array[end]) {
                start = mid;
            } else {
                --end;
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

    public int find2(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[start] < array[mid]) {
                if (array[start] <= target && target <= array[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else if (array[start] > array[mid]) {
                if (array[mid] <= target && target <= array[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            } else {
                ++start;
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
