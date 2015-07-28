package com.sonaive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liutao on 15-7-27.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] {2, 1, 5};
        List<Integer> list = Arrays.asList(numbers);
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> result = solution.permute(new ArrayList<Integer>(list));
        System.out.println(result.toString());
    }
}
