import java.util.ArrayList;

/**
 * Created by liutao on 11/2/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] inOrder = new int[] {4, 2, 5, 1, 6, 8, 3, 7};
        int[] postOrder = new int[] {4, 5, 2, 8, 6, 7, 3, 1};
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(inOrder, postOrder);
        ArrayList<ArrayList<Integer>> result = solution.levelOrderTraversal(root);
        for (ArrayList<Integer> level : result) {
            System.out.printf("Level result is %s\n", level.toString());
        }
    }
}
