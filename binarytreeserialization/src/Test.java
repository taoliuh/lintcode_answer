/**
 * Created by liutao on 11/4/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20);
        TreeNode right21 = new TreeNode(15);
        TreeNode right22 = new TreeNode(7);
        root.left = left1;
        root.right = right1;
        right1.left = right21;
        right1.right = right22;
        Solution solution = new Solution();
        String serialize = solution.serialize(root);
        System.out.printf("serialize result is %s\n", serialize);
        TreeNode node = solution.deserialize(serialize);
        String reserialize = solution.serialize(node);
        System.out.printf("reserialize result is %s\n", reserialize);
    }
}
