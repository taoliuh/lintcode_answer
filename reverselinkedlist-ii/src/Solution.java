import java.util.List;

/**
 *
 * Problem
 *
 * Reverse a linked list from position m to n.
 *
 * Example
 *
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4, return 1->4->3->2->5->NULL.
 *
 * Note
 *
 * Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.
 *
 * Created by liutao on 11/24/15.
 */
public class Solution {
    public ListNode reverseRange(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevNode = dummy;
        for (int i = 1; i < m; i++) {
            prevNode = prevNode.next;
        }
        ListNode prev = null;
        ListNode curr = prevNode.next;
        while (curr != null && m <= n) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            m++;
        }
        prevNode.next.next = curr;
        prevNode.next = prev;
        return dummy.next;
    }
}
