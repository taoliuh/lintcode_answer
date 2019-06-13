package me.sonaive;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param n: Given the range of numbers
     * @param k: Given the numbers of combinations
     * @return: All the combinations of k numbers out of 1..n
     */
    public List<List<Integer>> combine(int n, int k) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (n <= 0 || k <= 0 || n < k) {
            result.add(list);
            return result;
        }
        combinations(result, list, n, k, 0);
        return result;
    }
    
    private void combinations(List<List<Integer>> result, List<Integer> list, int n, int k, int pos) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
        }
        for (int i = pos; i < n; i++) {
            if (list.size() < k) {
                list.add(i + 1);
                combinations(result, list, n, k, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}