package me.sonaive;

/**
 * Created by liutao on 02/04/2019.
 */
public class Solution2 {
    public ListNode insert(ListNode node, int x) {
        // write your code here
        ListNode inserted = new ListNode(x);
        if (node == null) {
            inserted.next = inserted;
            return inserted;
        }
        ListNode head = node;
        while (node.next != head) {
            if (node.val > node.next.val && (node.val <= x || node.next.val >= x)) break;
            if (x >= node.val && x <= node.next.val) break;
            node = node.next;
        }
        inserted.next = node.next;
        node.next = inserted;
        return inserted;
    }
}
