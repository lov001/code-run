package leetcode.linkedlist.problem234;

import leetcode.linkedlist.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        ListNode q;
        ListNode current = slow;
        while (current != null) {
            q = current.next;
            current.next = prev;
            prev = current;
            current = q;
        }
        while (prev != null && head != null) {
            if (prev.val != head.val) {
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
