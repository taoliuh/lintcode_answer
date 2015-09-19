/**
 * Merge Sorted Array
 *
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 *
 * Created by liutao on 9/19/15.
 */
public class Solution {
    /**
     * @param a: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param b: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] a, int m, int[] b, int n) {
        int index = m + n - 1;
        while (m > 0 && n > 0) {
            if (a[m - 1] > b[n - 1]) {
                a[index] = a[m - 1];
                --m;
            } else {
                a[index] = b[n - 1];
                --n;
            }
            --index;
        }
        while (n > 0) {
            a[index] = b[n - 1];
            --n;
            --index;
        }
    }
}
