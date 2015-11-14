/**
 *
 * Binary Tree Maximum Path Sum II
 *
 * Given a binary tree, find the maximum path sum from root.
 *
 * The path may end at any node in the tree.
 *
 * Have you met this question in a real interview? Yes
 * Example
 * Given the below binary tree:
 *
 *   1
 *  / \
 * 2   3
 * return 4. (1->3)
 *
 * Created by liutao on 11/12/15.
 */
public class Solution {
    public int maxPathSum2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root).singlePath;
    }

    private ResultType dfs(TreeNode root) {
        if (root == null) {
            return new ResultType(0, Integer.MIN_VALUE);
        }
        ResultType left = dfs(root.left);
        ResultType right = dfs(root.right);
        int singlePath = Math.max(left.singlePath, right.singlePath) + root.value;
        int maxPath = Math.max(left.maxPath, right.maxPath);
        maxPath = Math.max(maxPath, left.singlePath + right.singlePath + root.value);
        return new ResultType(singlePath, maxPath);
    }

    class ResultType {
        public int singlePath;
        public int maxPath;
        public ResultType(int singlePath, int maxPath) {
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }
    }
}
