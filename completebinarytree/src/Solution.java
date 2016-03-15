/**
 * Created by liutao on 3/15/16.
 */
public class Solution {
    /**
     * @param root, the root of binary tree.
     * @return true if it is a complete binary tree, or false.
     */
    public boolean isComplete(TreeNode root) {
        // Write your code here
        if (root == null) {
            return true;
        }
        return dfs(root).isComplete;
    }

    private Result dfs(TreeNode root) {
        if (root == null) {
            return new Result(0, true, true);
        }
        Result left = dfs(root.left);
        Result right = dfs(root.right);
        if (!left.isComplete || !right.isComplete) {
            return new Result(-1, false, false);
        }
        if (left.maxDepth == right.maxDepth) {
            if (!left.isFull) {
                return new Result(-1, false, false);
            }
            return new Result(left.maxDepth + 1, right.isFull, true);
        }
        if (left.maxDepth == right.maxDepth + 1) {
            if (!right.isFull) {
                return new Result(-1, false, false);
            }
            return new Result(left.maxDepth + 1, false, true);
        }
        return new Result(-1, false, false);
    }

    class Result {
        int maxDepth;
        boolean isFull;
        boolean isComplete;
        public Result(int maxDepth, boolean isFull, boolean isComplete) {
            this.maxDepth = maxDepth;
            this.isFull = isFull;
            this.isComplete = isComplete;
        }
    }
}
