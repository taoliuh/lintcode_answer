/**
 * Created by liutao on 9/16/15.
 */
public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left1= new TreeNode(5);
        TreeNode right1 = new TreeNode(15);
        TreeNode right21 = new TreeNode(11);
        TreeNode right22 = new TreeNode(20);
        root.right = right1;
        right1.left = right21;
        right1.right = right22;
        root.left = left1;
        Solution iterator = new Solution(root);
        while (iterator.hasNext()) {
            TreeNode next = iterator.next();
            System.out.printf("%d ", next.value);
        }
    }
}
