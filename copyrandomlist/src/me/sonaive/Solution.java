package me.sonaive;

/**
 * Created by liutao on 29/03/2019.
 */
public class Solution {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        RandomListNode cur = head;
        while (cur != null) {
            RandomListNode copy = new RandomListNode(cur.label);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }
        cur = head;
        while (cur != null && cur.next != null) {
            if (cur.random != null) {
                if (cur.random == cur) {
                    cur.next.random = cur.next;
                } else {
                    cur.next.random = cur.random.next;
                }
            } else {
                cur.next.random = null;
            }
            cur = cur.next.next;
        }
        RandomListNode dummy = new RandomListNode(0);
        dummy.next = head.next;
        cur = head;
        while (cur != null && cur.next != null) {
            RandomListNode copy = cur.next;
            cur.next = copy.next;
            if (cur.next == null) {
                copy.next = null;
            } else {
                copy.next = cur.next.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
