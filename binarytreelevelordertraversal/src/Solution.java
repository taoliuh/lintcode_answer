import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Binary Tree Level Order Traversal
 * Given a binary tree, return the
 * level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * Example
 * Given binary tree {3,9,20,#,#,15,7},
 *    3
 *   / \
 *  9  20
 *     / \
 *    15  7
 *
 * return its level order traversal as:
 * [
 *  [3],
 *  [9,20],
 *  [15,7]
 * ]
 *
 * Created by liutao on 9/9/15.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> levelResult = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelResult.add(node.value);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(levelResult);
        }
        return result;
    }
}
