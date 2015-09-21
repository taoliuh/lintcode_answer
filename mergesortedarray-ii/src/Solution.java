import java.util.ArrayList;

/**
 * Merge Sorted Array II
 *
 * Merge two given sorted integer array A and B into a new sorted integer array.
 *
 * Example
 * A=[1,2,3,4]
 *
 * B=[2,4,5,6]
 *
 * return [1,2,2,3,4,4,5,6]
 *
 * Challenge
 * How can you optimize your algorithm if one array is very large and the other is very small?
 *
 * Created by liutao on 9/19/15.
 */
public class Solution {
    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> a, ArrayList<Integer> b) {
        // write your code here
        if (a == null && b == null) {
            return new ArrayList<>();
        }
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        ArrayList<Integer> result = new ArrayList<>(a.size() + b.size());
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                result.add(index, a.get(i));
                ++i;
            } else {
                result.add(index, b.get(j));
                ++j;
            }
            ++index;
        }
        while (i < a.size()) {
            result.add(index, a.get(i));
            ++i;
            ++index;
        }
        while (j < b.size()) {
            result.add(index, b.get(j));
            ++j;
            ++index;
        }
        return result;
    }
}
