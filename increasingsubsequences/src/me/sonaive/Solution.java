package me.sonaive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    /**
     * @param nums: an integer array
     * @return: all the different possible increasing subsequences of the given array
     */
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, nums, 0, new ArrayList<Integer>());
        return res;
    }
    
    private void dfs(List<List<Integer>> res, int[] nums, int idx,
                     List<Integer> buff) {
        if (buff.size() > 1) {
            res.add(new ArrayList<>(buff));
        }
        
        if (idx == nums.length) {
            return;
        }
        
        Set<Integer> set = new HashSet<>();
        for (int i = idx; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            if (buff.size() == 0 || nums[i] >= buff.get(buff.size() - 1)) {
                buff.add(nums[i]);
                dfs(res, nums, i + 1, buff);
                buff.remove(buff.size() - 1);
            }
        }
    }
}