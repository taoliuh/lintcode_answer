/**
 *
 * Distinct Subsequences
 *
 * Given a string S and a string T, count the number of distinct subsequences of T in S.
 *
 * A subsequence of a string is a new string which is formed from the original string
 * by deleting some (can be none) of the characters without disturbing the relative positions
 * of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 *
 * Example
 * Given S = "rabbbit", T = "rabbit", return 3.
 *
 * Challenge
 * Do it in O(n2) time and O(n) memory.
 *
 * O(n2) memory is also acceptable if you do not know how to optimize memory.
 *
 * Created by liutao on 11/14/15.
 */
public class Solution {
    public int numDistinct(String s, String t) {
        if (s == null || t == null) {
            return 0;
        }
        int len1 = s.length();
        int len2 = t.length();
        int[][] result = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            result[i][0] = 1;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                } else {
                    result[i][j] = result[i - 1][j];
                }
            }
        }
        return result[len1][len2];
    }
}
