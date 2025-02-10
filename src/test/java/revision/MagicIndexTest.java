package revision;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicIndexTest {

   MagicIndex classObj = new MagicIndex();

   @Test
   void test_magicIndex_expect2_whenNIs5() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(-5);
      input.add(-1);
      input.add(2);
      input.add(1);
      input.add(9);
      Assertions.assertEquals(2, classObj.magicIndex(input, 5));
      Assertions.assertEquals(2, classObj.magicIndexBinarySearch(input, 5));
      Assertions.assertEquals(2, classObj.magicIndexBinarySearchModified(input, 5));
   }

   @Test
   void test_magicIndex_expectMinus1_whenNIs5() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(2);
      input.add(3);
      input.add(4);
      input.add(5);
      input.add(6);
      Assertions.assertEquals(-1, classObj.magicIndex(input, 5));
      Assertions.assertEquals(-1, classObj.magicIndexBinarySearch(input, 5));
      Assertions.assertEquals(-1, classObj.magicIndexBinarySearchModified(input, 5));
   }
}
