import java.util.Set;

/**
 * Word Break
 *
 * Given a string s and a dictionary of words dict,
 * determine if s can be break into a space-separated sequence of one or more dictionary words.
 *
 * Created by liutao on 10/20/15.
 */
public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (dict == null || dict.size() == 0) {
            return false;
        }
        int maxWordLength = 0;
        for (String word : dict) {
            if (word.length() > maxWordLength) {
                maxWordLength = word.length();
            }
        }
        boolean[] canBreak = new boolean[s.length() + 1];
        canBreak[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (i - j > maxWordLength) {
                    break;
                }
                String subString = s.substring(j, i);
                if (canBreak[j] && dict.contains(subString)) {
                    canBreak[i] = true;
                }
            }
        }
        return canBreak[s.length()];
    }
}
