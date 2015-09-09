import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Binary Tree Level Order Traversal II
 *
 * Given a binary tree, return the bottom-up level
 * order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * Medium Binary Tree Level Order Traversal II
 *
 * Example
 * Given binary tree {3,9,20,#,#,15,7},
 *
 *      3
 *     / \
 *    9  20
 *       / \
 *      15  7
 *
 * return its bottom-up level order traversal as:
 *
 * [
 *  [15,7],
 *  [9,20],
 *  [3]
 * ]
 *
 * Created by liutao on 9/9/15.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
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
            result.add(0, level);
        }
        return result;
    }
}
