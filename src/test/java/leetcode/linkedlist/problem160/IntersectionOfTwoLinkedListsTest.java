package leetcode.linkedlist.problem160;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoLinkedListsTest {

    IntersectionOfTwoLinkedLists classObj = new IntersectionOfTwoLinkedLists();
    IntersectionOfTwoLinkedListsApproach2WithoutExtraSpace classObj2 =
        new IntersectionOfTwoLinkedListsApproach2WithoutExtraSpace();
    IntersectionOfTwoLinkedListsApproach3LengthDifference classObj3 =
        new IntersectionOfTwoLinkedListsApproach3LengthDifference();

    @Test
    void test_getIntersectionNode_expect8_whenListsIntersectAt8() {
        ListNode list1 = new ListNode(4);
        ListNode val1 = new ListNode(1);
        ListNode val2 = new ListNode(8);
        ListNode val3 = new ListNode(4);
        ListNode val4 = new ListNode(5);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        ListNode list2 = new ListNode(5);
        ListNode val21 = new ListNode(6);
        ListNode val22 = new ListNode(1);
        list2.next = val21;
        val21.next = val22;
        val22.next = val2;
        Assertions.assertEquals(val2, classObj.getIntersectionNode(list1, list2));
        Assertions.assertEquals(val2, classObj2.getIntersectionNode(list1, list2));
        Assertions.assertEquals(val2, classObj3.getIntersectionNode(list1, list2));
    }

    @Test
    void test_getIntersectionNode_expectNull_whenListsDoNotIntersect() {
        ListNode list1 = new ListNode(2);
        ListNode val1 = new ListNode(6);
        ListNode val2 = new ListNode(4);
        list1.next = val1;
        val1.next = val2;
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(5);
        Assertions.assertNull(classObj.getIntersectionNode(list1, list2));
        Assertions.assertNull(classObj2.getIntersectionNode(list1, list2));
        Assertions.assertNull(classObj3.getIntersectionNode(list1, list2));
    }

    @Test
    void test_getIntersectionNode_expect2_whenListsIntersectAt2() {
        ListNode list1 = new ListNode(1);
        ListNode val1 = new ListNode(9);
        ListNode val2 = new ListNode(1);
        ListNode val3 = new ListNode(2);
        ListNode val4 = new ListNode(4);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        ListNode list2 = new ListNode(3);
        list2.next = val3;
        Assertions.assertEquals(val3, classObj.getIntersectionNode(list1, list2));
        Assertions.assertEquals(val3, classObj2.getIntersectionNode(list1, list2));
        Assertions.assertEquals(val3, classObj3.getIntersectionNode(list1, list2));
    }
}
