package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConnectingTheGraphTest {

   ConnectingTheGraph classObj = new ConnectingTheGraph();

   @Test
   void test_connect_expect1_whenNumberOfVerticesIs4AndEdgesIs3() {
      int[][] edges = {{0, 1}, {0, 2}, {1, 2}};
      Assertions.assertEquals(1, classObj.connect(4, edges));
   }

   @Test
   void test_connect_expect2_whenNumberOfVerticesIs6AndEdgesIs5() {
      int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}};
      Assertions.assertEquals(2, classObj.connect(6, edges));
   }

   @Test
   void test_connect_expectMinusOne_whenNumberOfVerticesIs10AndEdgesIs3() {
      int[][] edges = {{3, 3}, {4, 1}, {1, 3}};
      Assertions.assertEquals(-1, classObj.connect(10, edges));
   }
}
