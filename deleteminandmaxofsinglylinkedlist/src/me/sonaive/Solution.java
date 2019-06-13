package me.sonaive;

/**
 * Created by liutao on 24/03/2019.
 */
public class Solution {
    public ListNode deleteMinAndMax(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int minVal, maxVal;
        minVal = maxVal = head.val;
        ListNode preMin, preMax, min, max;
        preMin = preMax = dummy;
        min = max = head;
        while (head.next != null) {
            if (minVal > head.next.val) {
                minVal = head.next.val;
                preMin = head;
                min = head.next;
            }
            if (maxVal < head.next.val) {
                maxVal = head.next.val;
                preMax = head;
                max = head.next;
            }
            head = head.next;
        }
        if (min.next == max) {
            preMin.next = max.next;
        } else if (max.next == min) {
            preMax.next = min.next;
        } else {
            preMin.next = min.next;
            preMax.next = max.next;
        }
        min.next = null;
        max.next = null;
        return dummy.next;
    }
}
