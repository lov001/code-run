package leetcode.linkedlist.problem83;

import static org.junit.jupiter.api.Assertions.assertEquals;

import leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListTest {

    RemoveDuplicatesFromSortedList classObj = new RemoveDuplicatesFromSortedList();

    @Test
    void test_deleteDuplicates_expectNewSortedListWithoutDuplicates() {
        ListNode head = new ListNode(1);
        ListNode val1 = new ListNode(1);
        ListNode val2 = new ListNode(2);
        head.next = val1;
        val1.next = val2;

        ListNode result = classObj.deleteDuplicates(head);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }

    @Test
    void test_deleteDuplicates_expectSortedListWithoutDuplicates() {
        ListNode head = new ListNode(1);
        ListNode val1 = new ListNode(1);
        ListNode val2 = new ListNode(2);
        ListNode val3 = new ListNode(3);
        ListNode val4 = new ListNode(3);
        head.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;

        ListNode result = classObj.deleteDuplicates(head);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
    }
}
