/**
 * Created by liutao on 11/24/15.
 */
public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode ln1 = new ListNode(3);
        ListNode ln2 = new ListNode(8);
        ListNode ln3 = new ListNode(11);
        ListNode ln4 = new ListNode(15);
        ListNode l2 = new ListNode(2);
        l1.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        Solution solution = new Solution();
        ListNode newHead = solution.mergeTwoLists(l1, l2);
        while (newHead != null) {
            System.out.printf("%d ", newHead.value);
            newHead = newHead.next;
        }
    }
}
