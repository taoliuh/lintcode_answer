import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
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

    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        if (inOrder == null || postOrder == null) {
            return null;
        }
        if (inOrder.length == 0 || postOrder.length == 0) {
            return null;
        }
        if (inOrder.length != postOrder.length) {
            return null;
        }
        return helper(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private TreeNode helper(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }
        int index = findPosition(inOrder, postOrder[postEnd], inStart, inEnd);
        if (index == -1) {
            return null;
        }
        TreeNode root = new TreeNode(postOrder[postEnd]);
        root.left = helper(postOrder, postStart, postStart + index - inStart - 1, inOrder, inStart, index - 1);
        root.right = helper(postOrder, postStart + index - inStart, postEnd - 1, inOrder, index + 1, inEnd);
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
