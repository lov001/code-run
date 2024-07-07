package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RottenOrangesTest {

   RottenOranges classObj = new RottenOranges();

   @Test
   void test_orangesRotting_expect1_whenMinimumTimeToRotAllOrangesIs1() {
      int[][] grid = {{0, 1, 2}, {0, 1, 2}, {2, 1, 1}};
      Assertions.assertEquals(1, classObj.orangesRotting(grid));
   }

   @Test
   void test_orangesRotting_expect1_whenNumberOfIslandsAre2() {
      int[][] grid = {{2, 2, 0, 1}};
      Assertions.assertEquals(-1, classObj.orangesRotting(grid));
   }
}
