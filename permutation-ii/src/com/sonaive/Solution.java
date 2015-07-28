package com.sonaive;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by liutao on 15-7-28.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.size()];
        Collections.sort(nums);
        if (nums == null || nums.size() == 0) {
            return result;
        }
        dfs(nums, path, result, visited);
        return result;
    }

    private void dfs(ArrayList<Integer> source, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result, boolean[]  visited) {
        if (path.size() == source.size()) {
            result.add(new ArrayList<Integer>(path));
        }
        for (int i = 0; i < source.size(); i++) {
            if (visited[i] || (i != 0 && source.get(i - 1) == source.get(i) && !visited[i - 1])) {
                continue;
            }
            path.add(source.get(i));
            visited[i] = true;
            dfs(source, path, result, visited);
            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }
}
