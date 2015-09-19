import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Remove Node in Binary Search Tree
 * Given a root of Binary Search Tree with unique value for each node.
 * Remove the node with given value.
 * If there is no such a node with given value in the binary search tree,
 * do nothing. You should keep the tree still a binary search tree after removal.
 *
 * Created by liutao on 9/16/15.
 */
public class Solution {

    private TreeNode mParent;

    public TreeNode removeNode(TreeNode root, int value) {
        TreeNode p;
        TreeNode parent;
        TreeNode successor;
        if (root == null) {
            return null;
        }
        p = findNode(root, value);
        if (p == null) {
            return root;
        }
        // p is leaf node
        if (p.left == null && p.right == null) {
            // p is root node
            if (p == root) {
                return null;
            }
            parent = mParent;
            if (parent.left == p) {
                parent.left = null;
            } else if (parent.right == p) {
                parent.right = null;
            }
            return root;
        }
        // p only have left sub tree
        if (p.right == null) {
            // p is root node
            if (p == root) {
                return p.left;
            }
            parent = mParent;
            if (parent.left == p) {
                parent.left = p.left;
            } else {
                parent.right = p.left;
            }
            return root;
        }
        // p only have right sub tree
        if (p.left == null) {
            if (p == root) {
                return p.right;
            }
            parent = mParent;
            if (parent.left == p) {
                parent.left = p.right;
            } else {
                parent.right = p.right;
            }
            return root;
        }
        // p have both left sub tree and right sub tree
        // 1.find successor node
        // 2.copy successor node value to p
        // 3.make the successor's parent point to the successor's right subtree

        // succ(p) is as as follows:  1 step right, all the way left
        // Note: succ(p) has NOT left child !

        // special case: the right child of p is the successor.
        if (p.right.left == null) {
            p.value = p.right.value;
            p.right = p.right.right;
        }
        successor = p.right;
        TreeNode succParent = p;
        while (successor.left != null) {
            succParent = successor;
            successor = successor.left;
        }
        p.value = successor.value;
        succParent.left = successor.right;
        return root;
    }

    private TreeNode findNode(TreeNode root, int value) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode head = stack.pop();
            if (head.value == value) {
                return head;
            } else if (head.value < value) {
                if (head.right != null) {
                    mParent = head;
                    stack.push(head.right);
                }
            } else {
                if (head.left != null) {
                    mParent = head;
                    stack.push(head.left);
                }
            }
        }
        return null;
    }

    public ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.value);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
