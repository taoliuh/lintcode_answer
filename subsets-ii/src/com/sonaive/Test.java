package com.sonaive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by liutao on 15-7-27.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] s = new Integer[] {1, 3, 9, 7};
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(s);
        Collections.sort(list);
        ArrayList<ArrayList<Integer>> result = solution.subsetsWithDup(new ArrayList<Integer>(list));
        System.out.print(result.toString());
    }
}
