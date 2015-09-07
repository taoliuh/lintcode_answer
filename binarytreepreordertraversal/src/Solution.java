import java.util.ArrayList;

/**
 *
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * Created by liutao on 9/7/15.
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        preOrderRecursionDfs(result, root);
        return result;
    }

    private void preOrderRecursionDfs(ArrayList<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }
        result.add(root.value);
        preOrderRecursionDfs(result, root.left);
        preOrderRecursionDfs(result, root.right);
    }
}
