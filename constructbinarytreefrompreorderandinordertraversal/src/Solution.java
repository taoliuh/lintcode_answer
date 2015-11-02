import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Construct Binary Tree from Preorder and Inorder Traversal
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * Given in-order [1,2,3] and pre-order [2,1,3], return a tree:
 *
 *   2
 *  / \
 * 1   3
 *
 * Created by liutao on 11/2/15.
 */
public class Solution {

    public ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                list.add(p.value);
                if (p.left != null) {
                    queue.offer(p.left);
                }
                if (p.right != null) {
                    queue.offer(p.right);
                }
            }
            result.add(list);
        }
        return result;
    }

    public TreeNode buildTree(int[] inOrder, int[] preOrder) {
        if (inOrder == null || preOrder == null) {
            return null;
        }
        if (inOrder.length == 0 || preOrder.length == 0) {
            return null;
        }
        if (inOrder.length != preOrder.length) {
            return null;
        }
        return helper(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private TreeNode helper(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int index = findPosition(inOrder, preOrder[preStart], inStart, inEnd);
        TreeNode root = new TreeNode(inOrder[index]);
        root.left = helper(preOrder, preStart + 1, preStart + index - inStart, inOrder, inStart, index - 1);
        root.right = helper(preOrder, preStart + index - inStart + 1, preEnd, inOrder, index + 1, inEnd);
        return root;
    }

    private int findPosition(int[] array, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
