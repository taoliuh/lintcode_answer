/**
 * Created by liutao on 9/22/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);
        TreeNode node12 = new TreeNode(12);
        TreeNode node13 = new TreeNode(13);
        TreeNode node14 = new TreeNode(14);
        TreeNode node15 = new TreeNode(15);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.right = node4;
        node3.left = node5;
        node4.right = node6;
        node5.left = node7;
        node6.right = node8;
        node7.left = node9;
        node8.right = node10;
        node9.left = node11;
        node10.right = node12;
        node11.left = node13;
        node12.right = node14;
        node14.left = node15;
        Solution solution = new Solution();
        int depth = solution.minDepth(root);
        System.out.printf("Minimum depth is %d", depth);
    }
}
