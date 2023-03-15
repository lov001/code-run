package leetcode.linkedlist.problem206;

public class ReverseLinkedList {

    public ListNode reversedList(ListNode head) {
        ListNode prev = null;
        ListNode q;
        ListNode current = head;
        while (current != null) {
            q = current.next;
            current.next = prev;
            prev = current;
            current = q;
        }
        head = prev;
        return head;
    }
}
