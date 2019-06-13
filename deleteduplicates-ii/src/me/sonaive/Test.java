package me.sonaive;

/**
 * Created by liutao on 30/03/2019.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution);
    }

    private static void test(Solution solution) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode head = solution.deleteDuplicates(l1);
        print(head);
    }

    private static void print(ListNode head) {
        if (head == null) {
            return;
        }
        while (head != null) {
            if (head.next == null) {
                System.out.print(head.val);
            } else {
                System.out.print(head.val + "->");
            }

            head = head.next;
        }
    }
}
