package leetcode.linkedlist.problem876;

import static org.junit.jupiter.api.Assertions.assertEquals;

import leetcode.linkedlist.problem876.ListNode;
import leetcode.linkedlist.problem876.MiddleElementOfLinkedList;
import org.junit.jupiter.api.Test;

public class MiddleElementOfLinkedListTest {

    MiddleElementOfLinkedList classObj = new MiddleElementOfLinkedList();

    @Test
    void test_mergeTwoLists_expectMiddleNode_whenInputHasOddNodes() {
        ListNode list1 = new ListNode(1);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(3);
        ListNode val3 = new ListNode(4);
        ListNode val4 = new ListNode(5);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        ListNode result = classObj.middleNode(list1);
        assertEquals(3, result.val);
        assertEquals(4, result.next.val);
        assertEquals(5, result.next.next.val);
    }

    @Test
    void test_mergeTwoLists_expectSecondMiddleNode_whenInputHasEvenNodes() {
        ListNode list1 = new ListNode(1);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(3);
        ListNode val3 = new ListNode(4);
        ListNode val4 = new ListNode(5);
        ListNode val5 = new ListNode(6);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        val4.next = val5;
        ListNode result = classObj.middleNode(list1);
        assertEquals(4, result.val);
        assertEquals(5, result.next.val);
        assertEquals(6, result.next.next.val);
    }

    @Test
    void test_mergeTwoLists_expectMiddleNode_whenInputHasTwoNodes() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        ListNode result = classObj.middleNode(list1);
        assertEquals(2, result.val);
    }

    @Test
    void test_mergeTwoLists_expectMiddleNode_whenInputHas3Nodes() {
        ListNode list1 = new ListNode(1);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(3);
        list1.next = val1;
        val1.next = val2;
        ListNode result = classObj.middleNode(list1);
        assertEquals(2, result.val);
        assertEquals(3, result.next.val);
    }
}
