/**
 *
 * Reverse a linked list.
 *
 * Example
 * For linked list 1->2->3, the reversed linked list is 3->2->1
 *
 * Challenge
 * Reverse it in-place and in one-pass
 *
 * Created by liutao on 11/24/15.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }

}
