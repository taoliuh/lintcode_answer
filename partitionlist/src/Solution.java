/**
 *
 * Problem
 *
 * Given a linked list and a value x, partition it such that all nodes less than x come before
 * nodes greater than or equal to x.
 *
 * You should preserve the original relative order of the nodes in each of the two partitions.
 *
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 *
 * Created by liutao on 11/24/15.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode leftDummy = new ListNode(0);
        ListNode leftCurrent = leftDummy;
        ListNode rightDummy = new ListNode(0);
        ListNode rightCurrent = rightDummy;
        ListNode runner = head;
        while (runner != null) {
            if (runner.value < x) {
                leftCurrent.next = runner;
                leftCurrent = leftCurrent.next;
            } else {
                rightCurrent.next = runner;
                rightCurrent = rightCurrent.next;
            }
            runner = runner.next;
        }
        rightCurrent.next = null;
        leftCurrent.next = rightDummy.next;
        return leftDummy.next;
    }
}
