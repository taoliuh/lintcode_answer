import java.util.*;

/**
 * Binary Tree Zigzag Level Order Traversal
 *
 * Given a binary tree, return the zigzag level order traversal
 * of its nodes' values. (ie, from left to right, then right to
 * left for the next level and alternate between).
 *
 * Created by liutao on 9/9/15.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrderZigzag(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> currentStack = new Stack<>();
        Stack<TreeNode> nextStack = new Stack<>();
        Stack<TreeNode> temp;
        currentStack.push(root);
        boolean reverse = false;
        while (!currentStack.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = currentStack.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = currentStack.pop();
                level.add(head.value);
                if (reverse) {
                    if (head.right != null) {
                        nextStack.push(head.right);
                    }
                    if (head.left != null) {
                        nextStack.push(head.left);
                    }
                } else {
                    if (head.left != null) {
                        nextStack.push(head.left);
                    }
                    if (head.right != null) {
                        nextStack.push(head.right);
                    }
                }
            }
            result.add(level);
            temp = currentStack;
            currentStack = nextStack;
            nextStack = temp;
            reverse = !reverse;
        }
        return result;
    }
}
