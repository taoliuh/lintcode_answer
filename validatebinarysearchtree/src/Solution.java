import java.util.Stack;

/**
 * Validate Binary Search Tree
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 * Created by liutao on 9/9/15.
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root).isBST;
    }

    private ResultType dfs(TreeNode root) {
        if (root == null) {
            return new ResultType(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        ResultType left = dfs(root.left);
        ResultType right = dfs(root.right);

        if (!left.isBST || !right.isBST) {
            // if is_bst is false then minValue and maxValue are useless
            return new ResultType(false, 0, 0);
        }

        if (root.left != null && left.max >= root.value ||
                root.right != null && right.min <= root.value) {
            return new ResultType(false, 0, 0);
        }

        return new ResultType(true,
                Math.max(root.value, right.max),
                Math.min(root.value, left.min));
    }
}
