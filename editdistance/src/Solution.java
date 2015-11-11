/**
 * Edit Distance
 *
 * Given two words word1 and word2, find the minimum number of steps
 * required to convert word1 to word2. (each operation is counted as 1 step.)
 *
 * You have the following 3 operations permitted on a word:
 *
 * Insert a character
 * Delete a character
 * Replace a character
 *
 * Created by liutao on 11/11/15.
 */
public class Solution {

    public int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return 0;
        }
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] result = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            result[i][0] = i;
        }
        for (int j = 0; j <= len2; j++) {
            result[0][j] = j;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    result[i][j] = Math.min(result[i - 1][j - 1], result[i][j - 1] + 1);
                    result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
                } else {
                    result[i][j] = Math.min(result[i - 1][j - 1] + 1, result[i][j - 1] + 1);
                    result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
                }
            }
        }
        return result[len1][len2];
    }
}
