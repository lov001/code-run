package practice.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListIntersectionUsingHashingOfTwoLinkedListsTest {

    LinkedListIntersectionUsingHashing classObj = new LinkedListIntersectionUsingHashing();

    @Test
    void test_getIntersectionNode_expect8_whenListsIntersectAt8() {
        Node list1 = new Node(4);
        Node val1 = new Node(1);
        Node val2 = new Node(8);
        Node val3 = new Node(4);
        Node val4 = new Node(5);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        Node list2 = new Node(5);
        Node val21 = new Node(6);
        Node val22 = new Node(1);
        list2.next = val21;
        val21.next = val22;
        val22.next = val2;
        Assertions.assertEquals(val2, classObj.intersectionWithHashSet(list1, list2));
    }

    @Test
    void test_getIntersectionNode_expectNull_whenListsDoNotIntersect() {
        Node list1 = new Node(2);
        Node val1 = new Node(6);
        Node val2 = new Node(4);
        list1.next = val1;
        val1.next = val2;
        Node list2 = new Node(1);
        list2.next = new Node(5);
        Assertions.assertNull(classObj.intersectionWithHashSet(list1, list2));
    }

    @Test
    void test_getIntersectionNode_expect2_whenListsIntersectAt2() {
        Node list1 = new Node(1);
        Node val1 = new Node(9);
        Node val2 = new Node(1);
        Node val3 = new Node(2);
        Node val4 = new Node(4);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        Node list2 = new Node(3);
        list2.next = val3;
        Assertions.assertEquals(val3, classObj.intersectionWithHashSet(list1, list2));
    }

    @Test
    void test_getIntersectionNode_expect15_whenListsIntersectAt15() {
        Node list1 = new Node(3);
        Node val1 = new Node(6);
        Node val2 = new Node(9);
        Node val3 = new Node(15);
        Node val4 = new Node(30);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        Node list2 = new Node(10);
        list2.next = val3;
        Assertions.assertEquals(val3, classObj.intersectionWithHashSet(list1, list2));
    }

    @Test
    void test_intersectionWithTwoPointers_expect8_whenListsIntersectAt8() {
        Node list1 = new Node(4);
        Node val1 = new Node(1);
        Node val2 = new Node(8);
        Node val3 = new Node(4);
        Node val4 = new Node(5);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        Node list2 = new Node(5);
        Node val21 = new Node(6);
        Node val22 = new Node(1);
        list2.next = val21;
        val21.next = val22;
        val22.next = val2;
        Assertions.assertEquals(val2, classObj.intersectionWithTwoPointers(list1, list2));
    }

    @Test
    void test_intersectionWithTwoPointers_expectNull_whenListsDoNotIntersect() {
        Node list1 = new Node(2);
        Node val1 = new Node(6);
        Node val2 = new Node(4);
        list1.next = val1;
        val1.next = val2;
        Node list2 = new Node(1);
        list2.next = new Node(5);
        Assertions.assertNull(classObj.intersectionWithTwoPointers(list1, list2));
    }

    @Test
    void test_intersectionWithTwoPointers_expect2_whenListsIntersectAt2() {
        Node list1 = new Node(1);
        Node val1 = new Node(9);
        Node val2 = new Node(1);
        Node val3 = new Node(2);
        Node val4 = new Node(4);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        Node list2 = new Node(3);
        list2.next = val3;
        Assertions.assertEquals(val3, classObj.intersectionWithTwoPointers(list1, list2));
    }

    @Test
    void test_intersectionWithTwoPointers_expect15_whenListsIntersectAt15() {
        Node list1 = new Node(3);
        Node val1 = new Node(6);
        Node val2 = new Node(9);
        Node val3 = new Node(15);
        Node val4 = new Node(30);
        list1.next = val1;
        val1.next = val2;
        val2.next = val3;
        val3.next = val4;
        Node list2 = new Node(10);
        list2.next = val3;
        Assertions.assertEquals(val3, classObj.intersectionWithTwoPointers(list1, list2));
    }
}
