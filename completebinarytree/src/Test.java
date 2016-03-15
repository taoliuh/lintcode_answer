/**
 * Created by liutao on 11/4/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left21 = new TreeNode(4);
        root.left = left1;
        root.right = right1;
        left1.left = left21;
        Solution solution = new Solution();
        System.out.print(solution.isComplete(root));

    }
}
