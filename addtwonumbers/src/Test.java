/**
 * Created by liutao on 3/16/16.
 */
public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(5);
        l1.next = a;
        a.next = b;

        ListNode l2 = new ListNode(5);
        ListNode c = new ListNode(9);
        ListNode d = new ListNode(2);
        l2.next = c;
        c.next = d;

        Solution solution = new Solution();
        ListNode head = solution.addLists(l1, l2);
        while (head != null) {
            System.out.printf("%d->", head.val);
            head = head.next;
        }
    }
}
