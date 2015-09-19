import java.util.Stack;

/**
 * Binary Search Tree Iterator
 *
 * Design an iterator over a binary search tree with the following rules:
 *
 * Elements are visited in ascending order (i.e. an in-order traversal)
 * next() and hasNext() queries run in O(1) time in average.
 *
 * Created by liutao on 9/16/15.
 */
public class Solution {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current;
    public Solution(TreeNode root) {
        this.current = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        return current != null || !stack.isEmpty();
    }

    //@return: return next node
    public TreeNode next() {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        TreeNode node = current;
        current = current.right;
        return node;
    }
}
