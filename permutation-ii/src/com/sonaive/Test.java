package com.sonaive;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by liutao on 15-7-28.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] nums = new Integer[] {3, 3 , 0 , 3};
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> result = solution.permuteUnique(new ArrayList<Integer>(Arrays.asList(nums)));
        System.out.println("Result: " + result.toString());
    }
}
