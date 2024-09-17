package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MGraphColoringTest {

   MGraphColoring classObj = new MGraphColoring();

   @Test
   void test_graphColoring_expectTrue_whenMIs3() {
      boolean[][] graph = {
         {false, true, true, false},
         {false, false, true, false},
         {false, false, false, true},
         {true, false, false, false}
      };
      Assertions.assertTrue(classObj.graphColoring(graph, 3, 4));
   }

   @Test
   void test_graphColoring_expectTrue_whenMIs2() {
      boolean[][] graph = {
         {false, true, true},
         {false, false, true}
      };
      Assertions.assertFalse(classObj.graphColoring(graph, 2, 3));
   }
}
