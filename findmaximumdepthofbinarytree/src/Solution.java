/**
 * Created by liutao on 9/7/15.
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return 0;
        }
        return dfs(depth, root);
    }

    public int dfs(int depth, TreeNode root) {
        if (root == null) {
            return depth;
        }
        ++depth;
        return Math.max(dfs(depth, root.left), dfs(depth, root.right));
    }
}
