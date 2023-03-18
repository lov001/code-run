package leetcode.linkedlist.problem234;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {

    PalindromeLinkedList classObj = new PalindromeLinkedList();

    @Test
    void test_isPalindrome_expectUpdateLinkedList_whenListContainsAllSameElement() {
        ListNode head = new ListNode(1);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(2);
        ListNode val3 = new ListNode(1);
        head.next = val1;
        val1.next = val2;
        val2.next = val3;
        assertTrue(classObj.isPalindrome(head));
    }

    @Test
    void test_removeElements_expectUpdateLinkedList_whenListContainsTwoElements() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(classObj.isPalindrome(head));
    }
}
