package revision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInARotatedArrayTest {

   SearchInARotatedArray classObj = new SearchInARotatedArray();

   @Test
   public void test_search_expect1_whenTargetIs5() {
      int[] input = {4, 5, 1, 2, 3};
      Assertions.assertEquals(1, classObj.search(input, 5));
   }

   @Test
   public void test_search_expectMinus1_whenTargetIs1() {
      int[] input = {2, 5, -3, 0};
      Assertions.assertEquals(-1, classObj.search(input, 1));
   }
}
