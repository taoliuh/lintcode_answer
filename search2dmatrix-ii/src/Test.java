/**
 * Created by liutao on 8/28/15.
 */
public class Test {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80},
                {63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81},
                {64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82},
                {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83},
                {66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84},
                {67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85}
        };
        Solution solution = new Solution();
        int occurrence = solution.searchMatrix(matrix, 81);
        System.out.printf("Find occurrence %d", occurrence);
    }
}
