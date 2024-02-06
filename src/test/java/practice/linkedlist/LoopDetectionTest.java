package practice.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class LoopDetectionTest {

   LoopDetection classObj = new LoopDetection();

   @Test
   void test_circularList_expectOne_whenCycleBeginsFromSecondNode() {
      Node list1 = new Node(3);
      Node val1 = new Node(2);
      Node val2 = new Node(0);
      Node val3 = new Node(4);
      list1.next = val1;
      val1.next = val2;
      val2.next = val3;
      val3.next = val1;
      assertEquals(val1, classObj.circularList(list1));
   }

   @Test
   void test_circularList_expectZero_whenInputHasTwoNodesAndCycleBeginsFromFirstNode() {
      Node val1 = new Node(1);
      Node val2 = new Node(2);
      val1.next = val2;
      val2.next = val1;
      assertEquals(val1, classObj.circularList(val1));
   }

   @Test
   void test_circularList_expectMinusOne_whenInputHasNoCycle() {
      Node list1 = new Node(1);
      assertNull(classObj.circularList(list1));
   }

   @Test
   void test_circularList_expectMinusOne_whenInputHasTwoNodesAndNoCycleExists() {
      Node val1 = new Node(1);
      val1.next = new Node(2);
      assertNull(classObj.circularList(val1));
   }

}
