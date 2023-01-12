package leetcode.problem142;

public class CircularLinkedList {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head, fast = head.next;
        while (slow != null && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == null) {
            return null;
        } else {
            while (head.next != slow) {
                head = head.next;
            }
            return head;
        }
    }
}
