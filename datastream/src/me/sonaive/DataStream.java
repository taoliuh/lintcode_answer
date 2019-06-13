package me.sonaive;

/**
 * Created by liutao on 02/04/2019.
 */
public class DataStream {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private ListNode mHead;

    public DataStream(){
        // do intialization if necessary
        mHead = new ListNode(0);
    }
    /**
     * @param num: next number in stream
     * @return: nothing
     */
    public void add(int num) {
        // write your code here
        ListNode inserted = new ListNode(num);
        ListNode head = mHead;
        while (head.next != null && head.next.val <= num) {
            head = head.next;
        }
        inserted.next = head.next;
        head.next = inserted;
    }

    /**
     * @return: the first unique number in stream
     */
    public int firstUnique() {
        // write your code here
        ListNode head = mHead.next;
        if (head == null) {
            return -1;
        }
        while (head != null) {
            int val = head.val;
            if (head.next != null && head.next.val == val) {
                while (head.next != null && head.next.val == val) {
                    head = head.next;
                }
                head = head.next;
            } else {
                return head.val;
            }
        }
        return -1;
    }
}
