/**
 *
 * There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays.
 *
 * Example
 * Given A=[1,2,3,4,5,6] and B=[2,3,4,5], the median is 3.5.
 *
 * Given A=[1,2,3] and B=[4,5], the median is 3.
 *
 * Challenge
 * The overall run time complexity should be O(log (m+n)).
 *
 * Created by liutao on 9/1/15.
 */
public class Solution {
    public double findMedian(int[] a, int[] b) {
        if (a == null || b == null || (a.length == 0 && b.length == 0)) {
            return -1;
        }
        int length = a.length + b.length;
        if (length % 2 == 0) {
            return (findKth(a, b, 0, 0, length / 2) + findKth(a, b, 0, 0, length / 2 + 1)) / (double) 2;
        } else {
            return findKth(a, b, 0, 0, length / 2 + 1);
        }
    }

    public int findKth(int[] a, int[] b, int indexA, int indexB, int k) {
        if (indexA >= a.length) {
            return b[indexB + k - 1];
        }
        if (indexB > b.length) {
            return b[indexA + k - 1];
        }
        if (k == 1) {
            return Math.min(a[indexA], b[indexB]);
        }
        int mid = k / 2 - 1;
        int valueA = indexA + mid >= a.length ? Integer.MAX_VALUE : a[indexA + mid];
        int valueB = indexB + mid >= b.length ? Integer.MAX_VALUE : b[indexB + mid];
        int newK = k - k / 2;
        if (valueA < valueB) {
            return findKth(a, b, indexA + k / 2, indexB, newK);
        } else {
            return findKth(a, b, indexA, indexB + k / 2, newK);
        }
    }
}
