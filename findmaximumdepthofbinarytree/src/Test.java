/**
 * Created by liutao on 9/7/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode right1 = new TreeNode(2);
        TreeNode right21 = new TreeNode(3);
        TreeNode right22 = new TreeNode(4);
        TreeNode right321 = new TreeNode(1);
        root.right = right1;
        right1.left = right21;
        right1.right = right22;
        right22.left = right321;

        Solution solution = new Solution();
        int depth = solution.maxDepth(root);
        System.out.printf("Max depth is %d", depth);
    }
}
