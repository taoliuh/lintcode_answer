package me.sonaive;

/**
 * Created by liutao on 25/03/2019.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        test1(solution);
    }

    private static void test1(Solution solution) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l1;
        ListNode inserted = solution.insert(l3, 1);
        print(inserted);
    }

    private static void print(ListNode head) {
        System.out.print(head.val + "->");
        ListNode cur = head.next;
        while (cur != head) {
            System.out.print(cur.val);
            if (cur.next != head) {
                System.out.print("->");
            }
            cur = cur.next;
        }
    }
}
