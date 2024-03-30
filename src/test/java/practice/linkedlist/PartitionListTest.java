package practice.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionListTest {


   PartitionList classObj = new PartitionList();

   @Test
   void test_partition_expectPartitionedList_whenXIs3() {
      Node node5 = new Node(2, null);
      Node node4 = new Node(5, node5);
      Node node3 = new Node(2, node4);
      Node node2 = new Node(3, node3);
      Node node1 = new Node(4, node2);
      Node root = new Node(1, node1);
      Node output = classObj.partition(root, 3);
      Assertions.assertEquals(1, output.data);
      Assertions.assertEquals(2, output.next.data);
      Assertions.assertEquals(2, output.next.next.data);
      Assertions.assertEquals(4, output.next.next.next.data);
      Assertions.assertEquals(3, output.next.next.next.next.data);
      Assertions.assertEquals(5, output.next.next.next.next.next.data);
   }

   @Test
   void test_partition_expectPartitionedList_whenXIs2() {
      Node node1 = new Node(1);
      Node root = new Node(2, node1);
      Node output = classObj.partition(root, 2);
      Assertions.assertEquals(1, output.data);
      Assertions.assertEquals(2, output.next.data);
   }
}
