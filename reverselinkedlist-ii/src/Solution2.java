/**
 * Created by liutao on 18/05/19.
 */
public class Solution2 {
    /**
     * @param head: ListNode head is the head of the linked list
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        if (head == null || m >= n) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode preM = dummy;
        for (int i = 1; i < m; i++) {
            preM = head;
            head = head.next;
        }
        ListNode mNode = head;
        ListNode pre = null, cur = mNode;
        for (int i = m; i <= n; i++) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        ListNode nNode = pre, postN = cur;
        preM.next = nNode;
        mNode.next = postN;
        return dummy.next;
    }
}
