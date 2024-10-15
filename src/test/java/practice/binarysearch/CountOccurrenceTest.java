package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountOccurrenceTest {

   CountOccurrencesOfElement classObj = new CountOccurrencesOfElement();

   @Test
   public void test_count_expect2_whenTargetIs3() {
      int[] input = {1, 1, 1, 2, 2, 3, 3};
      int actual = classObj.count(input, 7, 3);
      Assertions.assertEquals(2, actual);
   }

   @Test
   public void test_count_expect0_whenTargetIs6() {
      int[] input = {1, 2, 4, 4, 5};
      int actual = classObj.count(input, 5, 6);
      Assertions.assertEquals(0, actual);
   }
}
