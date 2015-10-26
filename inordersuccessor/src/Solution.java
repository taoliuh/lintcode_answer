/**
 * Inorder Successor in Binary Search Tree
 *
 * Given a binary search tree (See Definition) and a node in it,
 * find the in-order successor of that node in the BST.
 *
 * Created by liutao on 10/24/15.
 */
public class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || p == null) {
            return null;
        }
        TreeNode succ = null;
        while (root != null && root.value != p.value) {
            if (p.value < root.value) {
                succ = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return succ;
        }
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
