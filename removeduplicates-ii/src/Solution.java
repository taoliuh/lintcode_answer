/**
 * Remove Duplicates from Sorted Array II
 *
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 *
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 *
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 *[-8,0,1,2,3]
 * Created by liutao on 8/28/15.
 */
public class Solution {
    public int removeDuplicatesII(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int i = 1;
        int j = 0;
        int occurrence = 1;
        for (; i < array.length; i++) {
            if (array[j] != array[i]) {
                array[++j] = array[i];
                occurrence = 1;
            } else if (array[j] == array[i]) {
                if (occurrence < 2) {
                    array[++j] = array[i];
                    ++occurrence;
                }
            }
        }
        return j + 1;
    }
}
