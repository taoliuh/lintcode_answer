import java.util.ArrayDeque;

/**
 * Created by liutao on 4/6/16.
 */
public class Solution2 {
    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        // inorder and preorder traversal
        if (root == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                builder.append(node.val).append(" ");
                p = node.right;
            }
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            int len = stack.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = stack.pop();
                builder.append(node.val).append(" ");
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
        return builder.toString().trim();
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        if (data == null || data.equals("")) {
            return null;
        }
        String[] elements = data.split(" ");
        int len = elements.length;
        int[] preOrder = new int[len / 2];
        int[] inOrder = new int[len / 2];
        for (int i = 0; i < len / 2; i++) {
            inOrder[i] = Integer.valueOf(elements[i]);
        }
        for (int i = len / 2; i < len; i++) {
            preOrder[i - len / 2] = Integer.valueOf(elements[i]);
        }
        return buildTree(preOrder, inOrder);
    }

    private TreeNode buildTree(int[] preOrder, int[] inOrder) {
        if (preOrder == null || inOrder == null) {
            return null;
        }
        if (preOrder.length != inOrder.length) {
            return null;
        }
        return helper(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private TreeNode helper(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int target = preOrder[preStart];
        int index = findPosition(target, inOrder, inStart, inEnd);
        TreeNode root = new TreeNode(target);
        TreeNode left = helper(preOrder, preStart + 1, preStart + index - inStart, inOrder, inStart, index - 1);
        TreeNode right = helper(preOrder, preStart + index - inStart + 1, preEnd, inOrder, index + 1, inEnd);
        root.left = left;
        root.right = right;
        return root;
    }

    private int findPosition(int target, int[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
