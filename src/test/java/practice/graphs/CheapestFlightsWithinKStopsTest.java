package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheapestFlightsWithinKStopsTest {

   CheapestFlightsWithinKStops classObj = new CheapestFlightsWithinKStops();

   @Test
   void test_cheapestFlight_expect700_whenGivenGraph() {
      int[][] flights = {
         {0, 1, 100},
         {1, 2, 100},
         {2, 0, 100},
         {1, 3, 600},
         {2, 3, 200}};
      Assertions.assertEquals(700, classObj.cheapestFlight(4, flights, 0, 3, 1));
   }

   @Test
   void test_cheapestFlight_expect7_whenGivenGraph_() {
      int[][] flights = {
         {0, 1, 5},
         {0, 3, 2},
         {1, 2, 5},
         {1, 4, 1},
         {3, 1, 2},
         {4, 2, 1}};
      Assertions.assertEquals(7, classObj.cheapestFlight(5, flights, 0, 2, 2));
   }
}
