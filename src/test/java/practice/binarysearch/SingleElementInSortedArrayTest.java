package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleElementInSortedArrayTest {

   SingleElementInSortedArray classObj = new SingleElementInSortedArray();

   @Test
   void test_singleNonDuplicate_expect4_whenNIs7() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(1);
      input.add(2);
      input.add(2);
      input.add(4);
      input.add(5);
      input.add(5);
      Assertions.assertEquals(4, classObj.singleNonDuplicate(input));
      Assertions.assertEquals(4, classObj.singleNonDuplicateOptimised(input));
   }

   @Test
   void test_singleNonDuplicate_expect3_whenNIs5() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(1);
      input.add(3);
      input.add(5);
      input.add(5);
      Assertions.assertEquals(3, classObj.singleNonDuplicate(input));
      Assertions.assertEquals(3, classObj.singleNonDuplicateOptimised(input));
   }

   @Test
   void test_singleNonDuplicate_expect15_whenNIs5() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(1);
      input.add(4);
      input.add(4);
      input.add(15);
      Assertions.assertEquals(15, classObj.singleNonDuplicate(input));
      Assertions.assertEquals(15, classObj.singleNonDuplicateOptimised(input));
   }
}
