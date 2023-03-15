package leetcode.linkedlist.problem21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import leetcode.linkedlist.problem21.ListNode;
import leetcode.linkedlist.problem21.MergeTwoSortedLinkedList;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedLinkedListTest {

    MergeTwoSortedLinkedList classObj = new MergeTwoSortedLinkedList();

    @Test
    void test_mergeTwoLists_expectTwoListAreOfSameSize_whenInputGiven() {
        ListNode list1 = new ListNode(1);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(4);
        list1.next = val1;
        val1.next = val2;
        ListNode list2 = new ListNode(1);
        ListNode val21 = new ListNode(3);
        ListNode val22 = new ListNode(4);
        list2.next = val21;
        val21.next = val22;
        ListNode result = classObj.mergeTwoLists(list1, list2);
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
    }

    @Test
    void test_mergeTwoLists_expectBothAreEmptyLists_whenInputGiven() {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode result = classObj.mergeTwoLists(list1, list2);
        assertEquals(list2.val, result.val);
    }

    @Test
    void test_mergeTwoLists_expectOneEmptyListOneNonEmptyList_whenInputGiven() {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode(0);
        ListNode result = classObj.mergeTwoLists(list1, list2);
        assertEquals(list2.val, result.val);
    }

    @Test
    void test_mergeTwoLists_expectTwoListAreOfSameSize_whenInputContainsNegativeValue() {
        ListNode list1 = new ListNode(-9);
        list1.next = new ListNode(3);
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(7);
        ListNode result = classObj.mergeTwoLists(list1, list2);
        assertEquals(-9, result.val);
        assertEquals(3, result.next.val);
        assertEquals(5, result.next.next.val);
        assertEquals(7, result.next.next.next.val);
    }
}
