import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Binary Tree Postorder Traversal
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * Created by liutao on 9/22/15.
 */
public class Solution {
    public ArrayList<Integer> postOrderTraversalRecursion(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        ArrayList<Integer> left = postOrderTraversalRecursion(root.left);
        ArrayList<Integer> right = postOrderTraversalRecursion(root.right);
        result.addAll(left);
        result.addAll(right);
        result.add(root.value);
        return result;
    }

    public ArrayList<Integer> postOrderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode head = stack.pop();
            result.add(head.value);
            if (head.left != null) {
                stack.push(head.left);
            }
            if (head.right != null) {
                stack.push(head.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
