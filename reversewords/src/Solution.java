import java.util.Arrays;

/**
 * Reverse Words in a String
 * Given an input string, reverse the string word by word.
 *
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 *
 * Clarification
 * What constitutes a word?
 * A sequence of non-space characters constitutes a word.
 * Could the input string contain leading or trailing spaces?
 * Yes. However, your reversed string should not contain leading or trailing spaces.
 * How about multiple spaces between two words?
 * Reduce them to a single space in the reversed string.
 *
 * Created by liutao on 9/5/15.
 */
public class Solution {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        String[] array = s.split(" ");
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            String temp = array[left].trim();
            array[left] = array[right].trim();
            array[right] = temp;
            ++left;
            --right;
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (!array[i].trim().isEmpty()) {
                if (i == array.length - 1) {
                    result += array[i];
                } else {
                    result += array[i] + " ";
                }
            }
        }
        return result;
    }
}
