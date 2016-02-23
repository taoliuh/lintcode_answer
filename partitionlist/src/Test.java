/**
 * Created by liutao on 11/24/15.
 */
public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(4);
        head.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(2);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        ListNode node6 = new ListNode(2);
        node5.next = node6;
        Solution solution = new Solution();
        ListNode newHead = solution.partition(head, 3);
        while (newHead != null) {
            System.out.print(newHead.value + " ");
            newHead = newHead.next;
        }
    }
}
