import java.util.ArrayList;

/**
 * Triangle
 *
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 *
 * Example
 * For example, given the following triangle
 *
 * [
 *     [2],
 *    [3,4],
 *   [6,5,7],
 *  [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 *
 * Created by liutao on 10/10/15.
 */
public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return -1;
        }
        int size = triangle.size();
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            result[size - 1][i] = triangle.get(size - 1).get(i);
        }
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                result[i][j] = Math.min(result[i + 1][j], result[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return result[0][0];
    }
}
