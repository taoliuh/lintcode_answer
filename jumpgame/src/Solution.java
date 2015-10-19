/**
 * Jump Game
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * Created by liutao on 10/19/15.
 */
public class Solution {
    public boolean canJump(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        boolean[] result = new boolean[array.length];
        if (array[0] == 0) {
            result[0] = false;
        } else {
            result[0] = true;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (result[j] && j + array[j] >= i) {
                    result[i] = true;
                    break;
                }
            }
        }
        return result[array.length - 1];
    }
}
