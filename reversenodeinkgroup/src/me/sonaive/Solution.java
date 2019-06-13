package me.sonaive;

/**
 * Created by liutao on 02/04/2019.
 */
public class Solution {
    /**
     * @param head: a ListNode
     * @param k: An integer
     * @return: a ListNode
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        // write your code here
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        int length = 0;
        while (cur != null) {
            cur = cur.next;
            ++length;
        }
        int count = length / k;
        if (count == 0) {
            return head;
        }
        for (int i = 0; i < count; i++) {
            head = reverse(head, i * k + 1, k);
        }
        return head;
    }

    private ListNode reverse(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 1; i < m; i++) {
            pre = head;
            head = head.next;
        }
        ListNode preM = pre, mNode = pre.next;
        ListNode preN = mNode, nNode = mNode.next;
        for (int i = 1; i < n; i++) {
            ListNode temp = nNode.next;
            nNode.next = preN;
            preN = nNode;
            nNode = temp;
        }
        preM.next = preN;
        mNode.next = nNode;
        return dummy.next;
    }
}
