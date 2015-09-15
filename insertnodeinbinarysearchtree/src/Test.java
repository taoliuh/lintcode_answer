import java.util.ArrayList;

/**
 * Created by liutao on 9/10/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode left1= new TreeNode(5);
        TreeNode left21 = new TreeNode(4);
        TreeNode left22 = new TreeNode(7);
        TreeNode right1 = new TreeNode(12);
        TreeNode right21 = new TreeNode(10);
        TreeNode right22 = new TreeNode(16);
        root.right = right1;
        right1.left = right21;
        right1.right = right22;
        root.left = left1;
        left1.left = left21;
        left1.right = left22;

        TreeNode node = new TreeNode(6);
        Solution solution = new Solution();
        TreeNode newRoot = solution.insertNode(root, node);
        ArrayList<ArrayList<Integer>> result = solution.levelOrderTraverse(newRoot);
        for (ArrayList<Integer> level : result) {
            System.out.printf("Result is %s\n", level.toString());
        }
    }
}
