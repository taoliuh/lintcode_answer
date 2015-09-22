import java.util.LinkedList;
import java.util.Queue;

/**
 * Minimum Depth of Binary Tree
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path
 * from the root node down to the nearest leaf node.
 *
 * Created by liutao on 9/22/15.
 */
public class Solution {
    public int minDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ++depth;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                if (head.left == null && head.right == null) {
                    queue.clear();
                    break;
                }
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
        }
        return depth;
    }
}
