package me.sonaive;

/**
 * Created by liutao on 29/03/2019.
 */
public class Solution2 {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        copyNext(head);
        copyRandom(head);
        RandomListNode dummy = new RandomListNode(0);
        dummy.next = head.next;
        split(head);
        return dummy.next;
    }

    private void copyNext(RandomListNode head) {
        while (head != null) {
            RandomListNode copy = new RandomListNode(head.label);
            copy.next = head.next;
            copy.random = head.random;
            head.next = copy;
            head = copy.next;
        }
    }

    private void copyRandom(RandomListNode head) {
        while (head != null && head.next != null) {
            if (head.next.random != null) {
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
    }

    private void split(RandomListNode head) {
        while (head != null && head.next != null) {
            RandomListNode copy = head.next;
            head.next = copy.next;
            if (head.next == null) {
                copy.next = null;
            } else {
                copy.next = head.next.next;
            }
            head = head.next;
        }
    }
}
