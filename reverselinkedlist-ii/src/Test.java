/**
 * Created by liutao on 11/24/15.
 */
public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution solution = new Solution();
        ListNode front = solution.reverseRange(head, 2, 4);
        while (front != null) {
            System.out.printf("%d ", front.value);
            front = front.next;
        }
    }
}
