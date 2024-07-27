package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CityWithMinimumNeighborsTest {

   CityWithMinimumNeighbors classObj = new CityWithMinimumNeighbors();

   @Test
   void test_findCity_expect3_whenNIs4() {
      int[][] edges = {
         {0, 1, 3},
         {1, 2, 1},
         {1, 3, 4},
         {2, 3, 1}
      };
      Assertions.assertEquals(3, classObj.findCity(4, 4, edges, 4));
   }

   @Test
   void test_findCity_expect0_whenNIs5() {
      int[][] edges = {
         {0, 1, 2},
         {0, 4, 8},
         {1, 2, 3},
         {1, 4, 2},
         {2, 3, 1},
         {3, 4, 1}
      };
      Assertions.assertEquals(0, classObj.findCity(5, 6, edges, 2));
   }
}
