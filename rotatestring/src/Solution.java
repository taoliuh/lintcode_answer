/**
 * Rotate String
 *
 * Given a string and an offset, rotate string by offset. (rotate from left to right)
 *
 * Example
 * Given "abcdefg".
 *
 * offset=0 => "abcdefg"
 * offset=1 => "gabcdef"
 * offset=2 => "fgabcde"
 * offset=3 => "efgabcd"
 *
 * Rotate in-place with O(1) extra memory.
 *
 * Created by liutao on 9/5/15.
 */
public class Solution {
    public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0) {
            return;
        }
        int peak =  str.length - offset % str.length;
        rotate(str, 0, peak - 1);
        rotate(str, peak, str.length - 1);
        rotate(str, 0, str.length - 1);
    }

    private void rotate(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            ++left;
            --right;
        }
    }
}
