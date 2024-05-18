package practice.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobotInAGrid {

   public List<Point> findPath(boolean[][] maze) {
      if (maze == null || maze.length == 0) {
         return null;
      }
      List<Point> path = new ArrayList<>();
      Set<Point> failedPoints = new HashSet<>();
      if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
         return path;
      }
      return null;
   }

   private boolean getPath(boolean[][] maze, int row, int column, List<Point> path,
      Set<Point> failedPoints) {
      if (row < 0 || column < 0 || !maze[row][column]) {
         return false;
      }
      Point point = new Point(row, column);
      if (failedPoints.contains(point)) {
         return false;
      }
      boolean isAtOrigin = (row == 0) && (column == 0);
      if (isAtOrigin
         || getPath(maze, row - 1, column, path, failedPoints)
         || getPath(maze, row, column - 1, path, failedPoints)) {
         path.add(new Point(row, column));
         return true;
      }
      failedPoints.add(point);
      return false;
   }
}
