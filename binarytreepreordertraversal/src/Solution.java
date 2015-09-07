import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * Created by liutao on 9/7/15.
 */
public class Solution {
    public ArrayList<Integer> preOrderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        preOrderRecursionDfs(result, root);
        return result;
    }

    private void preOrderRecursionDfs(ArrayList<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }
        result.add(root.value);
        preOrderRecursionDfs(result, root.left);
        preOrderRecursionDfs(result, root.right);
    }

    public ArrayList<Integer> preOrderTraversalNonRecursion(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            result.add(top.value);
            if (top.right != null) {
                stack.push(top.right);
            }
            if (top.left != null) {
                stack.push(top.left);
            }
        }
        return result;
    }

    public ArrayList<Integer> preOrderTraversalDividerAndConquer(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root.value);
        ArrayList<Integer> leftSubResult = preOrderTraversalDividerAndConquer(root.left);
        ArrayList<Integer> rightSubResult = preOrderTraversalDividerAndConquer(root.right);
        result.addAll(leftSubResult);
        result.addAll(rightSubResult);
        return result;
    }
}
