package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountDistinctIslandsTest {

   CountDistinctIslands classObj = new CountDistinctIslands();

   @Test
   void test_countDistinctIslands_expect1_whenNoOfDistinctIslandsIs1() {
      int[][] input = {
         {1, 1, 0, 0, 0},
         {1, 1, 0, 0, 0},
         {0, 0, 0, 1, 1},
         {0, 0, 0, 1, 1}};
      Assertions.assertEquals(1, classObj.countDistinctIslands(input, "dfs"));
      Assertions.assertEquals(1, classObj.countDistinctIslands(input, "bfs"));
   }

   @Test
   void test_countDistinctIslands_expect3_whenNoOfDistinctIslandsIs3() {
      int[][] input = {
         {1, 1, 0, 1, 1},
         {1, 0, 0, 0, 0},
         {0, 0, 0, 0, 1},
         {1, 1, 0, 1, 1}};
      Assertions.assertEquals(3, classObj.countDistinctIslands(input, "dfs"));
      Assertions.assertEquals(3, classObj.countDistinctIslands(input, "bfs"));
   }
}
