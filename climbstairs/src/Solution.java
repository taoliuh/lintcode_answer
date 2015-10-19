/**
 * Climbing Stairs
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps.
 *
 * Created by liutao on 10/19/15.
 */
public class Solution {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] result = new int[n];
        result[0] = 1;
        if (n > 1) {
            result[1] = 2;
        }
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n - 1];
    }
}
