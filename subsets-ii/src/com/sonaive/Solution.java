package com.sonaive;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by liutao on 15-7-27.
 */
public class Solution {
    /**
     * @param s: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> s) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        if (s == null || s.size() == 0) {
            return result;
        }
        Collections.sort(s);
        dfs(s, 0, path, result);
        return result;
    }

    private void dfs(ArrayList<Integer> source, int index, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        result.add(new ArrayList<Integer>(path));
        System.out.println("Result: " + result.toString());
        for (int i = index; i < source.size(); i++) {
            if (i != index && source.get(i - 1) == source.get(i)) {
                continue;
            }
            path.add(source.get(i));
            System.out.println("Path add: " + path.toString());
            dfs(source, i + 1, path, result);
            System.out.println("Path remove: " + path.get(path.size() - 1) + ", current: " + path.toString());
            path.remove(path.size() - 1);
        }
    }
}
