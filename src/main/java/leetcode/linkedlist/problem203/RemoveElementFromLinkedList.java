package leetcode.linkedlist.problem203;

import leetcode.linkedlist.ListNode;

public class RemoveElementFromLinkedList {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            if (val == current.val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
