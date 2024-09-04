package practice.graphs;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslands2Test {

   NumberOfIslands2 classObj = new NumberOfIslands2();

   @Test
   void test_numberOfIslands_expectMaxIslandsAs2_whenNumberOfIslandsAre1() {
      int[][] grid = {{1, 1}, {0, 1}, {3, 3}, {3, 4}};
      List<Integer> output = List.of(1, 1, 2, 2);
      Assertions.assertEquals(output, classObj.numOfIslands(4, 5, grid));
   }

   @Test
   void test_numberOfIslands_expectMaxIslandsAs3_whenNumberOfNodesAre8() {
      int[][] grid = {{0, 0}, {1, 1}, {2, 2}, {3, 3}};
      List<Integer> output = List.of(1, 2, 3, 4);
      Assertions.assertEquals(output, classObj.numOfIslands(5, 4, grid));
   }

   @Test
   void test_numberOfIslands_expectMaxIslandsAs3_whenNumberOfNodesAre15() {
      int[][] grid = {{1, 1}, {0, 3}, {2, 3}, {2, 4}, {2, 4}, {2, 1}, {1, 4}, {0, 0}, {1, 2},
         {2, 0}};
      List<Integer> output = List.of(1, 2, 3, 3, 3, 3, 3, 4, 4, 4);
      Assertions.assertEquals(output, classObj.numOfIslands(3, 5, grid));
   }

   @Test
   void test_numberOfIslands_expectMaxIslandsAs2_whenNumberOfNodesAre8() {
      int[][] grid = {{1, 3}, {0, 3}, {0, 1}, {1, 1}, {1, 0}, {1, 2}, {0, 3}, {1, 2}};
      List<Integer> output = List.of(1, 1, 2, 2, 2, 1, 1, 1);
      Assertions.assertEquals(output, classObj.numOfIslands(2, 4, grid));
   }
}
