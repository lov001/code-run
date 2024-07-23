package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathWithMinimumEffortTest {

   PathWithMinimumEffort classObj = new PathWithMinimumEffort();

   @Test
   void test_minimumEffort_expect2_whenGivenGraph() {
      int[][] maze = {
         {1, 2, 2},
         {3, 8, 2},
         {5, 3, 5}};
      Assertions.assertEquals(2, classObj.minimumEffort(3, 3, maze));
   }

   @Test
   void test_minimumEffort_expect0_whenGivenGraph_() {
      int[][] maze = {
         {7, 7},
         {7, 7}};
      Assertions.assertEquals(0, classObj.minimumEffort(2, 2, maze));
   }
}
