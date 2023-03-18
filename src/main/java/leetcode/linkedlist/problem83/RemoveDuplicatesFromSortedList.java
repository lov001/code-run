package leetcode.linkedlist.problem83;

import leetcode.linkedlist.ListNode;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        while (current != null) {
            if (prev.val == current.val) {
                current = current.next;
                prev.next = current;
            } else{
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}
