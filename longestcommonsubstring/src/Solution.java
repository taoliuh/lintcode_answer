/**
 * Longest Common Substring
 *
 * Given two strings, find the longest common substring.
 *
 * Return the length of it.
 *
 * Example
 * Given A = "ABCD", B = "CBCE", return 2.
 *
 * Note
 * The characters in substring should occur continuously in original string.
 * This is different with subsequence.
 *
 * Created by liutao on 11/10/15.
 */
public class Solution {

    public int longestCommonSubstring(String a, String b) {
        if (a == null || b == null || a.length() == 0 || b.length() == 0) {
            return 0;
        }

        int maxLen = 0;
        int lenX = a.length();
        int lenY = b.length();
        for (int i = 0; i < lenX; ++i) {
            for (int j = 0; j < lenY; ++j) {
                int len = 0;
                while (i + len < lenX && j + len < lenY &&
                        a.charAt(i + len) == b.charAt(j + len)) {
                    len++;
                }
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }

}
