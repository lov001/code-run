package leetcode.linkedlist.problem203;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveElementFromLinkedListTest {

    RemoveElementFromLinkedList classObj = new RemoveElementFromLinkedList();

    @Test
    void test_removeElements_expectUpdateLinkedList_whenMatchingElementOccursTwice() {
        ListNode head = new ListNode(1);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(6);
        ListNode val3 = new ListNode(3);
        ListNode val4 = new ListNode(4);
        ListNode val5 = new ListNode(5);
        ListNode val6 = new ListNode(6);
        head.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        val4.next = val5;
        val5.next = val6;
        ListNode result = classObj.removeElements(head, 6);
        assertEquals(head.val, result.val);
        assertEquals(val1.val, result.next.val);
        assertEquals(val3.val, result.next.next.val);
        assertEquals(val4.val, result.next.next.next.val);
        assertEquals(val5.val, result.next.next.next.next.val);
    }

    @Test
    void test_removeElements_expectUpdateLinkedList_whenListIsEmpty() {
        ListNode result = classObj.removeElements(null, 1);
        assertNull(result);
    }

    @Test
    void test_removeElements_expectUpdateLinkedList_whenListContainsAllSameElement() {
        ListNode head = new ListNode(7);
        ListNode val1 = new ListNode(7);
        ListNode val2 = new ListNode(7);
        ListNode val3 = new ListNode(7);
        head.next = val1;
        val1.next = val2;
        val2.next = val3;
        ListNode result = classObj.removeElements(head, 7);
        assertNull(result);
    }

    @Test
    void test_removeElements_expectUpdateLinkedList_whenListContainsTwoElements() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = classObj.removeElements(head, 1);
        assertEquals(head.next.val, result.val);
    }
}
