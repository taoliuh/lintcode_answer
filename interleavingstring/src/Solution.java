/**
 * Interleaving String
 *
 * Given three strings: s1, s2, s3, determine whether
 * s3 is formed by the interleaving of s1 and s2.
 *
 * Example
 * For s1 = "aabcc", s2 = "dbbca"
 *
 * When s3 = "aadbbcbcac", return true.
 * When s3 = "aadbbbaccc", return false.
 *
 * Created by liutao on 11/16/15.
 */
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {

        int len1 = s1 == null ? 0 : s1.length();
        int len2 = s2 == null ? 0 : s2.length();
        int len3 = s3 == null ? 0 : s3.length();
        if (len1 + len2 < len3) {
            return false;
        }
        boolean[][] result = new boolean[len1 + 1][len2 + 1];
        result[0][0] = true;
        for (int i = 1; i <= len1; i++) {
            result[i][0] = s1.charAt(i - 1) == s3.charAt(i - 1) && result[i - 1][0];
        }
        for (int j = 1; j <= len2; j++) {
            result[0][j] = s2.charAt(j - 1) == s3.charAt(j - 1) && result[0][j - 1];
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                boolean case1 = s1.charAt(i - 1) == s3.charAt(i + j - 1) && result[i - 1][j];
                boolean case2 = s2.charAt(j - 1) == s3.charAt(i + j - 1) && result[i][j - 1];
                result[i][j] = case1 || case2;
            }
        }
        return result[len1][len2];
    }

}
