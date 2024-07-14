package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PreRequisiteTasksTest {

   PrerequisiteTasks classObj = new PrerequisiteTasks();

   @Test
   void test_isPossible_expectTrue_whenTasksCanBePerformed() {
      int[][] input = {{1, 0}, {2, 1}, {3, 2}};
//      Assertions.assertTrue(classObj.isPossible(4, 3, input, "dfs"));
      Assertions.assertTrue(classObj.isPossible(4, 3, input, "bfs"));
   }

   @Test
   void test_isPossible_expectFalse_whenTasksCannotBePerformed() {
      int[][] input = {{1, 0}, {0, 1}};
//      Assertions.assertFalse(classObj.isPossible(2, 2, input, "dfs"));
      Assertions.assertFalse(classObj.isPossible(2, 2, input, "bfs"));
   }
}
