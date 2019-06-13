package me.sonaive;

/**
 * Created by liutao on 29/03/2019.
 */
public class Test {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        test(solution);
    }

    private static void test(Solution2 solution) {
        RandomListNode l1 = new RandomListNode(1);
        RandomListNode l2 = new RandomListNode(2);
        l1.next = l2;
        l1.random = l2;
        l2.next = null;
        l2.random = l2;
        RandomListNode copy = solution.copyRandomList(l1);
        print(copy);
    }

    private static void print(RandomListNode head) {
        if (head == null) {
            return;
        }
        while (head != null) {
            if (head.next == null) {
                System.out.print(head.label);
            } else {
                System.out.print(head.label + "->");
            }

            head = head.next;
        }
    }
}
