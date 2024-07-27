package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FloydWarshalAlgorithmTest {

   FloydWarshalAlgorithm classObj = new FloydWarshalAlgorithm();

   @Test
   void test_shortest_distance_expect_whenGiven2x2Graph() {
      int[][] matrix = {
         {0, 25},
         {-1, 0}
      };
      int[][] output = {
         {0, 25},
         {-1, 0}
      };
      classObj.shortest_distance(matrix);
      Assertions.assertArrayEquals(output, matrix);
   }

   @Test
   void test_shortest_distance_expect_whenGiven3x3Graph() {
      int[][] matrix = {
         {0, 1, 43},
         {1, 0, 6},
         {-1, -1, 0}
      };
      int[][] output = {
         {0, 1, 7},
         {1, 0, 6},
         {-1, -1, 0}
      };
      classObj.shortest_distance(matrix);
      Assertions.assertArrayEquals(output, matrix);
   }
}
