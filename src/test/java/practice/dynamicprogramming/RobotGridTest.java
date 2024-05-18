package practice.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobotGridTest {

   RobotInAGrid classObj = new RobotInAGrid();

   @Test
   void test_findPath_expectNull_whenPathDoesNotExist() {
      boolean[][] maze = {
         {true, true, false, true, false},
         {true, true, true, true, false},
         {false, false, true, false, false},
         {true, false, false, true, true},
         {false, false, false, false, true}
      };
      Assertions.assertNull(classObj.findPath(maze));
   }

   @Test
   void test_findPath_expectTrue_whenPathExist() {
      boolean[][] maze = {
         {true, true, false, true, false},
         {true, true, true, true, false},
         {false, false, true, true, false},
         {true, false, false, true, true},
         {false, false, false, true, true}
      };
      List<Point> path = classObj.findPath(maze);
      List<Point> expectedPath = new ArrayList<>();
      expectedPath.add(new Point(0, 0));
      expectedPath.add(new Point(0, 1));
      expectedPath.add(new Point(1, 1));
      expectedPath.add(new Point(1, 2));
      expectedPath.add(new Point(1, 3));
      expectedPath.add(new Point(2, 3));
      expectedPath.add(new Point(3, 3));
      expectedPath.add(new Point(3, 4));
      expectedPath.add(new Point(4, 4));
      Assertions.assertEquals(Arrays.toString(expectedPath.toArray()),
         Arrays.toString(path.toArray()));
   }
}
