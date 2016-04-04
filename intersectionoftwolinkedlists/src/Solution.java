/**
 * Created by liutao on 4/4/16.
 */
public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Write your code here
        if (headA == null || headB == null) {
            return null;
        }
        if (headA.val == headB.val) {
            return headA;
        }
        ListNode pa = headA, pb = headB;
        while (pa.next != null && pb.next != null) {
            pa = pa.next;
            pb = pb.next;
        }
        ListNode p = null;
        if (pa.next == null) {
            pa.next = headA;
            p = headB;
        } else if (pb.next == null) {
            pb.next = headB;
            p = headA;
        }
        ListNode slow = p, fast = p;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        while (p != slow) {
            p = p.next;
            slow = slow.next;
        }
        return p;
    }
}
