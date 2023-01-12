package leetcode.problem142;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class CircularLinkedListTest {

    CircularLinkedList classObj = new CircularLinkedList();
    CircularLinkedListApproach2 classObj2 = new CircularLinkedListApproach2();

    @Test
    void test_detectCycle_expectOne_whenCycleBeginsFromSecondNode() {
        ListNode list1 = new ListNode(3);
        ListNode val1 = new ListNode(2);
        ListNode val2 = new ListNode(0);
        ListNode val3 = new ListNode(4);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val1;
        assertEquals(val1, classObj.detectCycle(list1));
        assertEquals(val1, classObj2.detectCycle(list1));
    }

    @Test
    void test_detectCycle_expectZero_whenInputHasTwoNodesAndCycleBeginsFromFirstNode() {
        ListNode val1 = new ListNode(1);
        ListNode val2 = new ListNode(2);
        val1.next = val2;
        val2.next = val1;
        assertEquals(val1, classObj.detectCycle(val1));
        assertEquals(val1, classObj2.detectCycle(val1));
    }

    @Test
    void test_detectCycle_expectMinusOne_whenInputHasNoCycle() {
        ListNode list1 = new ListNode(1);
        assertNull(classObj.detectCycle(list1));
        assertNull(classObj2.detectCycle(list1));
    }

    @Test
    void test_detectCycle_expectMinusOne_whenInputHasTwoNodesAndNoCycleExists() {
        ListNode val1 = new ListNode(1);
        val1.next = new ListNode(2);
        assertNull(classObj.detectCycle(val1));
        assertNull(classObj2.detectCycle(val1));
    }
}
