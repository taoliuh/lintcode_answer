package me.sonaive;

/**
 * Created by liutao on 13/06/19.
 */
public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution solution = new Solution();
        ListNode front = solution.deleteMinAndMax(head);
        while (front != null) {
            System.out.printf("%d ", front.val);
            front = front.next;
        }
    }
}
