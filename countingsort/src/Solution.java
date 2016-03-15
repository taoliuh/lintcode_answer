/**
 * Created by liutao on 3/13/16.
 */
public class Solution {
    /**
     *
     * @param a array to be sorted
     * @param k elements in array should be smaller than k and larger than or equals to 0.
     * @return sorted array
     */
    public static int[] countSort(int[] a, int k) {
        if (a == null || a.length == 0) {
            return null;
        }
        int len = a.length;
        int[] b = new int[len];
        int[] c = new int[k];
        for (int i = 0; i < len; i++) {
            c[a[i]] += 1;
        }
        for (int i = 1; i < k; i++) {
            c[i] += c[i - 1];
        }
        for (int i = 0; i < len; i++) {
            b[c[a[i]] - 1] = a[i];
            c[a[i]] -= 1;
        }
        return b;
    }
}
