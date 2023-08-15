package leetcode.linkedlist.problem86;

import leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionListTest {


   PartitionList classObj = new PartitionList();

   @Test
   void test_partition_expectPartitionedList_whenXIs3() {
      ListNode node5 = new ListNode(2, null);
      ListNode node4 = new ListNode(5, node5);
      ListNode node3 = new ListNode(2, node4);
      ListNode node2 = new ListNode(3, node3);
      ListNode node1 = new ListNode(4, node2);
      ListNode root = new ListNode(1, node1);
      ListNode output = classObj.partition(root, 3);
      Assertions.assertEquals(1, output.val);
      Assertions.assertEquals(2, output.next.val);
      Assertions.assertEquals(2, output.next.next.val);
      Assertions.assertEquals(4, output.next.next.next.val);
      Assertions.assertEquals(3, output.next.next.next.next.val);
      Assertions.assertEquals(5, output.next.next.next.next.next.val);
   }

   @Test
   void test_partition_expectPartitionedList_whenXIs2() {
      ListNode node1 = new ListNode(1);
      ListNode root = new ListNode(2, node1);
      ListNode output = classObj.partition(root, 2);
      Assertions.assertEquals(1, output.val);
      Assertions.assertEquals(2, output.next.val);
   }
}
