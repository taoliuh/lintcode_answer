/**
 * Created by liutao on 3/16/16.
 */
public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        l1.next = l2;

        Solution solution = new Solution();
        ListNode head = solution.insertionSortList(l1);
        while (head != null) {
            System.out.printf("%d->", head.val);
            head = head.next;
        }
    }
}
