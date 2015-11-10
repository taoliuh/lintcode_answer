/**
 * Longest Common Subsequence
 *
 * Given two strings, find the longest common subsequence (LCS).
 *
 * Your code should return the length of LCS.
 *
 * Example
 * For "ABCD" and "EDCA", the LCS is "A" (or "D", "C"), return 1.
 *
 * For "ABCD" and "EACB", the LCS is "AC", return 2.
 *
 * Created by liutao on 11/10/15.
 */
public class Solution {
    public int longestCommonSubsequence(String a, String b) {
        if (a == null || b == null || a.length() == 0 || b.length() == 0) {
            return 0;
        }
        int len = Math.min(a.length(), b.length());
        int[][] result = new int[len + 1][len + 1];
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if (a.charAt(i - 1) != b.charAt(j - 1)) {
                    result[i][j] = Math.max(result[i][j - 1], result[i - 1][j]);
                } else {
                    result[i][j] = result[i - 1][j - 1] + 1;
                }
            }
        }
        return result[len][len];
    }
}
