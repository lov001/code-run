package revision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {

   NumberOfIslands classObj = new NumberOfIslands();

   @Test
   void test_getTotalIslands_expect3_whenNoOfIslandsIs3() {
      int[][] input = {
         {0, 1, 1, 0, 0},
         {1, 0, 0, 1, 0},
         {0, 0, 1, 0, 0},
         {1, 0, 0, 0, 1}};
      Assertions.assertEquals(3, classObj.getTotalIslands(input, "dfs"));
   }

   @Test
   void test_getTotalIslands_expect1_whenNoOfDistinctIslandsIs1() {
      int[][] input = {
         {1, 1, 0, 0, 0},
         {1, 1, 0, 0, 0},
         {0, 0, 0, 1, 1},
         {0, 0, 0, 1, 1}};
      Assertions.assertEquals(2, classObj.getTotalIslands(input, "dfs"));
   }

   @Test
   void test_getTotalIslands_expect4_whenNoOfDistinctIslandsIs3() {
      int[][] input = {
         {1, 1, 0, 1, 1},
         {1, 0, 0, 0, 0},
         {0, 0, 0, 0, 1},
         {1, 1, 0, 1, 1}};
      Assertions.assertEquals(4, classObj.getTotalIslands(input, "dfs"));
   }

   @Test
   void test_getTotalIslands_expect1_whenNoOfIslandsIs1() {
      int[][] input = {
         {1, 0, 0, 1},
         {0, 1, 1, 0},
         {0, 1, 1, 0},
         {1, 0, 0, 1}};
      Assertions.assertEquals(1, classObj.getTotalIslands(input, "dfs"));
   }

   @Test
   void test_getTotalIslandsBfs_expect3_whenNoOfIslandsIs3() {
      int[][] input = {
         {0, 1, 1, 0, 0},
         {1, 0, 0, 1, 0},
         {0, 0, 1, 0, 0},
         {1, 0, 0, 0, 1}};
      Assertions.assertEquals(3, classObj.getTotalIslands(input, "bfs"));
   }

   @Test
   void test_getTotalIslandsBfs_expect1_whenNoOfDistinctIslandsIs1() {
      int[][] input = {
         {1, 1, 0, 0, 0},
         {1, 1, 0, 0, 0},
         {0, 0, 0, 1, 1},
         {0, 0, 0, 1, 1}};
      Assertions.assertEquals(2, classObj.getTotalIslands(input, "bfs"));
   }

   @Test
   void test_getTotalIslandsBfs_expect4_whenNoOfDistinctIslandsIs3() {
      int[][] input = {
         {1, 1, 0, 1, 1},
         {1, 0, 0, 0, 0},
         {0, 0, 0, 0, 1},
         {1, 1, 0, 1, 1}};
      Assertions.assertEquals(4, classObj.getTotalIslands(input, "bfs"));
   }

   @Test
   void test_getTotalIslandsBfs_expect1_whenNoOfIslandsIs1() {
      int[][] input = {
         {1, 0, 0, 1},
         {0, 1, 1, 0},
         {0, 1, 1, 0},
         {1, 0, 0, 1}};
      Assertions.assertEquals(1, classObj.getTotalIslands(input, "bfs"));
   }
}
