/**
 Description

 Write a method to replace all spaces in a string with %20. The string is given in a characters array, you can assume it has enough space for replacement and you are given the true length of the string.

 You code should also return the new length of the string after replacement.

 If you are using Java or Python，please use characters array instead of string.

 Have you met this question in a real interview?
 Example
 Example 1:

 Input: string[] = "Mr John Smith" and length = 13
 Output: string[] = "Mr%20John%20Smith" and return 17
 Explanation:
 The string after replacement should be "Mr%20John%20Smith", you need to change the string in-place and return the new length 17.

 Challenge
 Do it in-place.
 */
public class Solution {
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // write your code here
        if (string == null || length <= 0) {
            return 0;
        }
        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') {
                ++spaces;
            }
        }
        int newLength = length + spaces * 2;
        int endIndex = newLength - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[endIndex--] = '0';
                string[endIndex--] = '2';
                string[endIndex--] = '%';
            } else {
                string[endIndex--] = string[i];
            }
        }
        return newLength;
    }
}
