package me.sonaive;

/**
 * Created by liutao on 25/03/2019.
 */
public class Solution {
    /*
     * @param node: a list node in the list
     * @param x: An integer
     * @return: the inserted new list node
     */
    public ListNode insert(ListNode node, int x) {
        // write your code here
        if (node == null) {
            ListNode insertNode = new ListNode(x);
            insertNode.next = insertNode;
            return insertNode;
        }
        ListNode insertNode = new ListNode(x);
        if (node.next == node) {
            node.next = insertNode;
            insertNode.next = node;
            return insertNode;
        }
        Pair pair = breakCircle(node);
        ListNode head = pair.head;
        ListNode tail = pair.tail;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val <= cur.next.val) {
                cur = cur.next;
            } else {
                break;
            }
        }
        tail.next = head;
        tail = cur;
        head = cur.next;
        cur.next = null;
        cur = head;
        ListNode pre = null;
        while (cur != null) {
            if (cur.val <= x) {
                pre = cur;
                cur = cur.next;
            } else {
                break;
            }
        }
        if (pre == null) {
            insertNode.next = head;
            head = insertNode;
        } else {
            insertNode.next = pre.next;
            pre.next = insertNode;
        }

        if (tail.next == insertNode) {
            insertNode.next = head;
        } else {
            tail.next = head;
        }
        return insertNode;
    }

    private Pair breakCircle(ListNode node) {
        ListNode head = node.next;
        ListNode tail = node;
        node.next = null;
        Pair pair = new Pair(head, tail);
        return pair;
    }

    class Pair {
        ListNode head;
        ListNode tail;
        public Pair(ListNode head, ListNode tail) {
            this.head = head;
            this.tail = tail;
        }
    }
}
