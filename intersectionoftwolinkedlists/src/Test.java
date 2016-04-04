/**
 * Created by liutao on 4/4/16.
 */
public class Test {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode _2 = new ListNode(2);
        ListNode _3 = new ListNode(3);
        ListNode _4 = new ListNode(4);
        ListNode _5 = new ListNode(5);
        ListNode _6 = new ListNode(6);
        ListNode _7 = new ListNode(7);
        ListNode _8 = new ListNode(8);
        ListNode _9 = new ListNode(9);
        ListNode _10 = new ListNode(10);
        ListNode _11 = new ListNode(11);
        ListNode _12 = new ListNode(12);
        ListNode _13 = new ListNode(13);
        ListNode headB = _6;
        headA.next = _2;
        _2.next = _3;
        _3.next = _4;
        _4.next = _5;
        _5.next = _6;
        _6.next = _7;
        _7.next = _8;
        _8.next = _9;
        _9.next = _10;
        _10.next = _11;
        _11.next = _12;
        _12.next = _13;
        ListNode result = Solution.getIntersectionNode(headA, headB);
        System.out.print(result.val);
    }
}
