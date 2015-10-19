/**
 * Jump Game II
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 *
 * Created by liutao on 10/19/15.
 */
public class Solution {
    public int minimumJump(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (j + array[j] >= i) {
                    int count = result[j] + 1;
                    if (result[i] == 0 || result[i] > count) {
                        result[i] = count;
                    }
                }
            }
        }
        return result[array.length - 1];
    }
}
