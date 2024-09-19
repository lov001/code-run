package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RatInAMazeTest {

   RatInAMaze classObj = new RatInAMaze();

   @Test
   void test_findPath_expect2Paths_whenGiven4x4Maze() {
      int[][] maze = {
         {1, 0, 0, 0},
         {1, 1, 0, 1},
         {1, 1, 0, 0},
         {0, 1, 1, 1}
      };
      ArrayList<String> expected = new ArrayList<>();
      expected.add("DDRDRR");
      expected.add("DRDDRR");
      ArrayList<String> actual = classObj.findPath(maze);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertEquals(expected.get(i), actual.get(i));
      }
   }

   @Test
   void test_findPath_expect2Paths_whenGiven2x2Maze() {
      int[][] maze = {
         {1, 0},
         {1, 0},
      };
      ArrayList<String> actual = classObj.findPath(maze);
      Assertions.assertEquals(1, actual.size());
      Assertions.assertEquals("-1", actual.get(0));
   }
}
