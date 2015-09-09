/**
 *
 * Binary Tree Maximum Path Sum
 *
 * Given a binary tree, find the maximum path sum.
 * The path may start and end at any node in the tree.
 *
 * Created by liutao on 9/8/15.
 */
public class Solution {

    class ResultType {
        public int singlePath;  // 从root往下走到任意点的最大路径，可以不包含任何结点
        public int maxPath;     // 树中任意点到任意点得最大路径，至少包含一个结点
        public ResultType(int singlePath, int maxPath) {
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }
    }

    public int maxPath(TreeNode root) {
        ResultType result = dfs(root);
        return result.maxPath;
    }

    private ResultType dfs(TreeNode root) {
        if (root == null) {
            return new ResultType(0, Integer.MIN_VALUE);
        }
        // Divider
        ResultType left = dfs(root.left);
        ResultType right = dfs(root.right);
        // Conquer
        int singlePath = Math.max(left.singlePath, right.singlePath) + root.value;
        singlePath = Math.max(singlePath, 0);
        int maxSubPath = Math.max(left.maxPath, right.maxPath);
        int maxPath = Math.max(maxSubPath, root.value + left.maxPath + right.maxPath);
        System.out.printf("Single path is %d\n", singlePath);
        System.out.printf("Max path is %d\n", maxPath);
        return new ResultType(singlePath, maxPath);
    }
}
