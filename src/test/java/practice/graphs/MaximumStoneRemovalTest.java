package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumStoneRemovalTest {

   MaximumStoneRemoval classObj = new MaximumStoneRemoval();

   @Test
   void test_maxRemove_expect5_whenNIs6() {
      int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
      Assertions.assertEquals(5, classObj.maxRemove(stones, 6));
   }
}
