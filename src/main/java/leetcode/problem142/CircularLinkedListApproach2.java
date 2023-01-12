package leetcode.problem142;

public class CircularLinkedListApproach2 {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode ptr = head;
        while (ptr != null && ptr.visited == -1) {
            ptr.visited = 0;
            ptr = ptr.next;
        }
        return ptr;
    }
}
