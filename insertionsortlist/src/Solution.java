/**
 * Created by liutao on 3/16/16.
 */
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = head;
        head = head.next;
        while (head != null) {
            if (head.val < tail.val) {
                ListNode pre = dummy;
                while (pre != tail && pre.next != null && pre.next.val < head.val) {
                    pre = pre.next;
                }
                ListNode temp = head.next;
                head.next = pre.next;
                pre.next = head;
                head = temp;
                tail.next = head;
            } else {
                tail = head;
                head = head.next;
            }
        }
        return dummy.next;
    }

}
