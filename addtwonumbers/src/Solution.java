/**
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 *
 *
 * Given 7->1->6 + 5->9->2. That is, 617 + 295.
 *
 * Return 2->1->9. That is 912.
 *
 * Given 3->1->5 and 5->9->2, return 8->0->8.
 *
 * Created by liutao on 3/16/16.
 */
public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return reverseList(l2);
        }
        if (l2 == null) {
            return reverseList(l1);
        }
        int i1 = toDigits(l1);
        int i2 = toDigits(l2);
        int sum = i1 + i2;
        return buildList(sum);
    }

    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

    private int toDigits(ListNode head) {
        if (head == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.insert(0, head.val);
            head = head.next;
        }
        return Integer.valueOf(sb.toString());
    }

    private ListNode buildList(int number) {
        String s = String.valueOf(number);
        char[] chars = s.toCharArray();
        ListNode tail = null;
        for (int i = 0; i < chars.length; i++) {
            ListNode p = new ListNode(Integer.valueOf(chars[i] + ""));
            p.next = tail;
            tail = p;
        }
        return tail;
    }
}
