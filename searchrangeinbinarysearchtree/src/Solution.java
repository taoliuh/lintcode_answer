import java.util.ArrayList;
import java.util.Stack;

/**
 * Search Range in Binary Search Tree
 *
 * Given two values k1 and k2 (where k1 < k2) and a root pointer to a
 * Binary Search Tree. Find all the keys of tree in range k1 to k2. i.e.
 * print all x such that k1<=x<=k2 and x is a key of given BST.
 * Return all the keys in ascending order.
 *
 * Created by liutao on 9/15/15.
 */
public class Solution {

    public ArrayList<Integer> searchRangeNonRecursion(TreeNode root, int k1, int k2) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode t = stack.pop();
                if (t.value >= k1 && t.value <= k2) {
                    result.add(t.value);
                }
                p = t.right;
            }
        }
        return result;
    }

    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode head = stack.pop();
            if (head.value >= k1 && head.value <= k2) {
                insert(result, head.value);
                if (head.left != null) {
                    stack.push(head.left);
                }
                if (head.right != null) {
                    stack.push(head.right);
                }
            } else if (head.value < k1) {
                if (head.right != null) {
                    stack.push(head.right);
                }
            } else if (head.value > k2) {
                if (head.left != null) {
                    stack.push(head.left);
                }
            }
        }
        return result;
    }

    private void insert(ArrayList<Integer> data, int value) {
        if (data == null) {
            return;
        }
        int pos = findInsertPosition(data, value);
        data.add(pos, value);
    }

    private int findInsertPosition(ArrayList<Integer> data, int value) {
        if (data == null || data.size() == 0) {
            return 0;
        }
        int start = 0;
        int end = data.size() - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (data.get(mid) == value) {
                return mid;
            } else if (data.get(mid) < value) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (data.get(start) >= value) {
            return start;
        } else if (data.get(end) >= value) {
            return end;
        } else {
            return end + 1;
        }
    }

    public ArrayList<Integer> searchRangeRecursion(TreeNode root, int k1, int k2) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(result, root, k1, k2);
        return result;
    }

    public void dfs(ArrayList<Integer> result, TreeNode root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.value > k1) {
            dfs(result, root.left, k1, k2);
        }
        if (root.value >= k1 && root.value <= k2) {
            insert(result, root.value);
        }
        if (root.value < k2) {
            dfs(result, root.right, k1, k2);
        }
    }
}
