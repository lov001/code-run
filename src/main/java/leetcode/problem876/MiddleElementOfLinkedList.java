package leetcode.problem876;


public class MiddleElementOfLinkedList {

    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
