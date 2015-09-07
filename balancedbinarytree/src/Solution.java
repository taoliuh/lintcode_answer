/**
 * Balanced Binary Tree
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Created by liutao on 9/7/15.
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        // Divide and Conquer
        return maxDepth(root) != -1;
    }

    private int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth);
    }
}
