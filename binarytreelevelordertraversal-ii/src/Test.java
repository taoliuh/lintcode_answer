import java.util.ArrayList;

/**
 * Created by liutao on 9/9/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-20);
        TreeNode left1= new TreeNode(5);
        TreeNode left21 = new TreeNode(4);
        TreeNode left22 = new TreeNode(10);
        TreeNode right1 = new TreeNode(2);
        TreeNode right21 = new TreeNode(3);
        TreeNode right22 = new TreeNode(4);
        TreeNode right321 = new TreeNode(1);
        root.right = right1;
        right1.left = right21;
        right1.right = right22;
        right22.left = right321;
        root.left = left1;
        left1.left = left21;
        left1.right = left22;
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> result = solution.levelOrderBottom(root);
        for (ArrayList<Integer> level : result) {
            System.out.printf("Level result is %s\n", level.toString());
        }
    }
}
