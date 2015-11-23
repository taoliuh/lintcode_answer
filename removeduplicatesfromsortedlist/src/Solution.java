/**
 *
 * Remove Duplicates from Sorted List
 *
 * Problem
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example
 *
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * Created by liutao on 11/23/15.
 */
public class Solution {
    public ListNode removeDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        while (curr != null) {
            while (curr.next != null && curr.value == curr.next.value) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
