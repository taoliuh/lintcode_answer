/**
 *
 * Remove Duplicates from Sorted List II
 *
 * Problem
 *
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 *
 * Example
 *
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 *
 * Created by liutao on 11/23/15.
 */
public class Solution {
    public ListNode removeDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            if (curr.next.value == curr.next.next.value) {
                int prevValue = curr.next.value;
                while (curr.next != null && curr.next.value == prevValue) {
                    curr.next = curr.next.next;
                }
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
