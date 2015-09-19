import java.util.ArrayList;

/**
 * Created by liutao on 9/16/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(31);
        TreeNode left1= new TreeNode(11);
        TreeNode left21= new TreeNode(8);
        TreeNode right1 = new TreeNode(51);
        TreeNode right21 = new TreeNode(41);
        TreeNode right22 = new TreeNode(21);
        root.right = right1;
        right1.left = right21;
        right1.right = right22;
        root.left = left1;
        left1.left = left21;
        Solution solution = new Solution();
        TreeNode newRoot = solution.removeNode(root, 11);
        ArrayList<ArrayList<Integer>> result = solution.levelOrderTraversal(newRoot);
        for (ArrayList<Integer> level : result) {
            System.out.printf("%s \n", level.toString());
        }
    }
}
