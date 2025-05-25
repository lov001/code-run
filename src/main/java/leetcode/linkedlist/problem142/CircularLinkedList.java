package leetcode.linkedlist.problem142;

public class CircularLinkedList {

    /**
     Detect Loop (Cycle):
     Use two pointers (slow and fast).
     Move slow by one node and fast by two nodes.
     If they meet, a loop exists.

     Find the Start of the Loop:
     Once a loop is detected (when slow == fast), move one pointer to the head of the list.
     Keep the other at the meeting point.
     Move both one step at a time. The point they meet again is the start of the loop.

     Remove the Loop:
     Once the start of the loop is found, traverse from there to find the node that links back to the loop start.
     Set that node’s next to null to break the loop.
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (head != slow) {
                    slow = slow.next;
                    head = head.next;
                }
                return slow;
            }
        }
        return null;
    }
}
