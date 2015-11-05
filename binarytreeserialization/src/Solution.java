import java.util.*;

/**
 * Binary Tree Serialization
 *
 * Design an algorithm and write code to serialize and deserialize a binary tree.
 * Writing the tree to a file is called 'serialization' and reading back from the
 * file to reconstruct the exact same binary tree is 'deserialization'.
 *
 * There is no limit of how you deserialize or serialize a binary tree, you only
 * need to make sure you can serialize a binary tree to a string and deserialize
 * this string to the original structure.
 *
 * Example
 * An example of test data: Binary tree {3,9,20,#,#,15,7}, denote the following structure:
 *
 *    3
 *   / \
 *  9  20
 *     / \
 *    15  7
 * Our data serialization use bfs traversal. This is just for when you got wrong answer
 * and want to debug the input.
 *
 * You can use other method to do serializaiton and deserialization.
 *
 * Created by liutao on 11/4/15.
 */
public class Solution {
    public String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                if (p != null) {
                    builder.append(p.value).append(',');
                } else {
                    builder.append("#,");
                }
                if (p != null) {
                    queue.offer(p.left);
                    queue.offer(p.right);
                }
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        for (int i = builder.length(); i >= 0; i = i - 2) {
            if (builder.charAt(i - 1) != '#') {
                break;
            } else {
                builder.delete(i - 2, i);
            }
        }
        return builder.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }
        String[] list = data.split(",");
        int index = 0;
        TreeNode root = new TreeNode(Integer.parseInt(list[index]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                ++index;
                if (index >= list.length) {
                    break;
                }
                if (!list[index].equals("#")) {
                    p.left = new TreeNode(Integer.parseInt(list[index]));
                    queue.offer(p.left);
                } else {
                    queue.offer(null);
                }
                ++index;
                if (index >= list.length) {
                    break;
                }
                if (!list[index].equals("#")) {
                    p.right = new TreeNode(Integer.parseInt(list[index]));
                    queue.offer(p.right);
                } else {
                    queue.offer(null);
                }
            }
        }
        return root;
    }
}
