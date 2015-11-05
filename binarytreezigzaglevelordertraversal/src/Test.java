import java.util.ArrayList;

/**
 * Created by liutao on 9/9/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1= new TreeNode(2);
        TreeNode left21 = new TreeNode(4);
        TreeNode right1 = new TreeNode(3);
        TreeNode right22 = new TreeNode(5);
        TreeNode right31 = new TreeNode(6);
        TreeNode right32 = new TreeNode(7);
        TreeNode right42 = new TreeNode(8);
        root.right = right1;
        right1.right = right22;
        right22.left = right31;
        right22.right = right32;
        right32.right = right42;
        root.left = left1;
        left1.left = left21;
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> result = solution.levelOrderZigzag(root);
        for (ArrayList<Integer> level : result) {
            System.out.printf("Level result is %s\n", level.toString());
        }
    }
}
