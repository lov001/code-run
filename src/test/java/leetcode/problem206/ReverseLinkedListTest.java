package leetcode.problem206;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    ReverseLinkedList classObj = new ReverseLinkedList();

    @Test
    void test_reversedList_expectReversedLinkedList_whenInputGiven() {
        ListNode head = new ListNode(1);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(3);
        ListNode val3 = new ListNode(4);
        ListNode val4 = new ListNode(5);
        head.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        ListNode result = classObj.reversedList(head);
        assertEquals(val4.val, result.val);
        assertEquals(val3.val, result.next.val);
        assertEquals(val2.val, result.next.next.val);
        assertEquals(val1.val, result.next.next.next.val);
        assertEquals(head.val, result.next.next.next.next.val);
    }
}
