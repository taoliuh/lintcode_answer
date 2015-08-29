/**
 *
 * There is an integer array which has the following features:
 *
 * The numbers in adjacent positions are different.
 * A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
 * We define a position P is a peek if:
 *
 * A[P] > A[P-1] && A[P] > A[P+1]
 * Find a peak element in this array. Return the index of the peak.
 *
 *
 * Created by liutao on 8/29/15.
 */
public class Solution {

    public int findPeakElement(int[] elements) {
        if (elements == null || elements.length < 3) {
            return -1;
        }
        int start = 0;
        int end = elements.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (elements[mid] > elements[mid - 1] && elements[mid] > elements[mid + 1]) {
                return mid;
            } else if (elements[mid] < elements[mid - 1]) {
                end = mid;
            } else if (elements[mid] < elements[mid + 1]) {
                start = mid;
            }
        }
        if (elements[start] > elements[start - 1] && elements[start] > elements[start + 1]) {
            return start;
        }
        if (elements[end] > elements[end - 1] && elements[end] > elements[end + 1]) {
            return end;
        }
        return -1;
    }
}
