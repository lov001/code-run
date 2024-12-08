package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PainterPartitionProblemTest {

   PainterPartitionProblem classObj = new PainterPartitionProblem();

   @Test
   void test_findLargestMinDistance_expect60_whenNIs4AndKIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(10);
      input.add(20);
      input.add(30);
      input.add(40);
      Assertions.assertEquals(60, classObj.findLargestMinDistanceBruteForce(input, 2));
      Assertions.assertEquals(60, classObj.findLargestMinDistanceBinarySearch(input, 2));
   }

   @Test
   void test_findLargestMinDistance_expect11_whenNIs6AndKIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(2);
      input.add(1);
      input.add(5);
      input.add(6);
      input.add(3);
      input.add(2);
      Assertions.assertEquals(11, classObj.findLargestMinDistanceBruteForce(input, 2));
      Assertions.assertEquals(11, classObj.findLargestMinDistanceBinarySearch(input, 2));
   }

   @Test
   void test_findLargestMinDistance_expect90_whenNIs2AndKIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(48);
      input.add(90);
      Assertions.assertEquals(90, classObj.findLargestMinDistanceBruteForce(input, 2));
      Assertions.assertEquals(90, classObj.findLargestMinDistanceBinarySearch(input, 2));
   }
}
