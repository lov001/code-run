package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeliverShipmentInDDaysTest {

   DeliverShipmentInDDays classObj = new DeliverShipmentInDDays();

   @Test
   void test_leastWeightCapacity_expect9_whenDaysIs5() {
      int[] input = {5, 4, 5, 2, 3, 4, 5, 6};
      Assertions.assertEquals(9, classObj.leastWeightCapacity(input, 5));
      Assertions.assertEquals(9, classObj.leastWeightCapacity(input, 5));
   }

   @Test
   void test_leastWeightCapacity_expect55_whenDaysIs1() {
      int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Assertions.assertEquals(55, classObj.leastWeightCapacity(input, 1));
      Assertions.assertEquals(55, classObj.leastWeightCapacity(input, 1));
   }

   @Test
   void test_leastWeightCapacity_expect3_whenDaysIs5() {
      int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Assertions.assertEquals(15, classObj.leastWeightCapacity(input, 5));
      Assertions.assertEquals(15, classObj.leastWeightCapacity(input, 5));
   }
}
