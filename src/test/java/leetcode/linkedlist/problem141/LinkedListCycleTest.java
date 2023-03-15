package leetcode.linkedlist.problem141;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import leetcode.linkedlist.problem141.LinkedListCycle;
import leetcode.linkedlist.problem141.LinkedListCycleSetApproach;
import leetcode.linkedlist.problem141.ListNode;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

    LinkedListCycle classObj = new LinkedListCycle();
    LinkedListCycleSetApproach cycleSetApproach = new LinkedListCycleSetApproach();

    @Test
    void test_hasCycle_expectTrue_whenCycleExistsInALinkedList() {
        ListNode list1 = new ListNode(3);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(0);
        ListNode val3 = new ListNode(-4);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val1;
        assertTrue(classObj.hasCycle(list1));
        assertTrue(cycleSetApproach.hasCycle(list1));
    }

    @Test
    void test_hasCycle_expectTrue_whenCycleExistsInALinkedListAtFirstIndex() {
        ListNode list1 = new ListNode(1);
        ListNode val1 = new ListNode(2);
        list1.next = val1;
        val1.next = list1;
        assertTrue(classObj.hasCycle(list1));
        assertTrue(cycleSetApproach.hasCycle(list1));
    }

    @Test
    void test_hasCycle_expectFalse_whenOnlyOneElement() {
        ListNode list1 = new ListNode(1);
        assertFalse(classObj.hasCycle(list1));
        assertFalse(cycleSetApproach.hasCycle(list1));
    }
}
