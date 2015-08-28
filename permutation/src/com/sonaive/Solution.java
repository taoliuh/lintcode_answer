package com.sonaive;

import java.util.ArrayList;

/**
 * Created by liutao on 15-7-27.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> numbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>();
        if (numbers == null || numbers.size() == 0) {
            return result;
        }
        dfs(numbers, list, result);
        return result;
    }

    private void dfs(ArrayList<Integer> source, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (path.size() == source.size()) {
            result.add(new ArrayList<>(path));
            System.out.println("Result: " + result.toString());
        }
        for (int i = 0; i < source.size(); i++) {
            if (path.contains(source.get(i))) {
                continue;
            }
            path.add(source.get(i));
            System.out.println("Path add: " + path.toString() + ", pos: " + i);
            dfs(source, path, result);
            System.out.println("Path remove: " + path.get(path.size() - 1) + ", current: " + path.toString() + ", pos: " + i);
            path.remove(path.size() - 1);
        }
    }
}
