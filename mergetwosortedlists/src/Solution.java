/**
 *
 * Merge Two Sorted Lists
 *
 * Problem
 *
 * Merge two sorted (ascending) linked lists and return it as a new sorted list.
 * The new sorted list should be made by splicing together the nodes of the two lists
 * and sorted in ascending order.
 *
 * Example
 *
 * Given 1->3->8->11->15->null, 2->null , return 1->2->3->8->11->15->null.
 *
 * Created by liutao on 11/24/15.
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        return dummy.next;
    }
}
