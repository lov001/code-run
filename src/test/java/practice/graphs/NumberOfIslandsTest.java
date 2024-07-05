package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {

   NumberOfIslands classObj = new NumberOfIslands();

   @Test
   void test_numberOfIslands_expect2_whenNumberOfIslandsAre1() {
      char[][] grid = {{'0', '1'}, {'1', '0'}, {'1', '1'}, {'1', '0'}};
      Assertions.assertEquals(1, classObj.numberOfIslandsBFS(grid));
   }

   @Test
   void test_numberOfIslands_expect1_whenNumberOfIslandsAre2() {
      char[][] grid = {{'0', '1', '1', '1', '0', '0', '0'}, {'0', '0', '1', '1', '0', '1', '0'}};
      Assertions.assertEquals(2, classObj.numberOfIslandsBFS(grid));
   }

   @Test
   void test_numberOfIslands_expect3_whenNumberOfNodesAre8() {
      char[][] grid = {{'0', '1'}, {'1', '0'}, {'1', '1'}, {'1', '0'}};
      Assertions.assertEquals(1, classObj.numberOfIslandsBFS(grid));
   }
}
