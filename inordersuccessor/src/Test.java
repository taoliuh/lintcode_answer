/**
 * Created by liutao on 10/24/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left1= new TreeNode(5);
        TreeNode right1 = new TreeNode(15);
        TreeNode right21 = new TreeNode(11);
        TreeNode right22 = new TreeNode(20);
        root.right = right1;
        right1.left = right21;
        right1.right = right22;
        root.left = left1;

        TreeNode p = new TreeNode(15);
        Solution solution = new Solution();
        TreeNode node = solution.inorderSuccessor(root, p);
        System.out.printf("Successor node is %s", node != null ? node.value : "null");
    }
}
