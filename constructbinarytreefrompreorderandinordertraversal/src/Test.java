import java.util.ArrayList;

/**
 * Created by liutao on 11/2/15.
 */
public class Test {
    public static void main(String[] args) {
//        int[] inOrder = new int[] {4, 2, 5, 1, 6, 8, 3, 7};
        int[] inOrder = new int[] {1, 2};
//        int[] preOrder = new int[] {1, 2, 4, 5, 3, 6, 8, 7};
        int[] preOrder = new int[] {1, 2};
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(inOrder, preOrder);
        ArrayList<ArrayList<Integer>> result = solution.levelOrderTraversal(root);
        for (ArrayList<Integer> level : result) {
            System.out.printf("Level result is %s\n", level.toString());
        }
    }
}
