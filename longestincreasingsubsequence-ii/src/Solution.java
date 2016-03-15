import java.util.Arrays;

/**
 * Longest Increasing Subsequence
 *
 * Given a sequence of integers, find the longest increasing subsequence (LIS).
 *
 * You code should return the length of the LIS.
 *
 * Example
 * For [5, 4, 1, 2, 3], the LIS  is [1, 2, 3]
 *
 * For [4, 2, 4, 5, 3, 7], the LIS is [4, 4, 5, 7]
 *
 * Challenge
 * Time complexity O(n^2) or O(nlogn)
 *
 * Challenge
 * Time complexity O(n^2) or O(nlogn)
 *
 * Clarification
 * What's the definition of longest increasing subsequence?
 *
 * The longest increasing subsequence problem is to find a subsequence
 * of a given sequence in which the subsequence's elements are in sorted order,
 * lowest to highest, and in which the subsequence is as long as possible.
 * This subsequence is not necessarily contiguous, or unique.
 *
 * https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
 *
 * Created by liutao on 3/14/16.
 */
public class Solution {
    public int[] longestIncreasingSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        for (int i = 1, len = nums.length; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && result[i] < result[j] + 1) {
                    result[i] = result[j] + 1;
                }
            }
        }
        int max = 0;
        int index = 0;
        for (int i = 0, len = result.length; i < len; i++) {
            if (max < result[i]) {
                max = result[i];
                index = i;
            }
        }
        int[] lis = new int[max];
        for (int i = index; i >= 0; i--) {
            if (result[i] == max) {
                lis[max - 1] = nums[i];
                --max;
            }
        }
        return lis;
    }

}
