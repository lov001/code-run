package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;

public class RatInAMaze {

   private static final char[] MAP = {'D', 'L', 'R', 'U'};

   public ArrayList<String> findPath(int[][] mat) {
      ArrayList<String> output = new ArrayList<>();
      boolean[][] visited = new boolean[mat.length][mat[0].length];
      if (mat[0][0] == 0) {
         output.add("-1");
         return output;
      }
      helper(0, 0, "", visited, mat, output);
      if (output.size() == 0) {
         output.add("-1");
      }
      return output;
   }

   private void helper(int row, int column, String path, boolean[][] visited, int[][] mat,
      ArrayList<String> output) {
      if (row == mat.length - 1 && column == mat[0].length - 1) {
         output.add(path);
         return;
      }
      visited[row][column] = true;
      int[] delRow = {1, 0, 0, -1};
      int[] delCol = {0, -1, 1, 0};
      for (int i = 0; i < 4; i++) {
         int adjRow = row + delRow[i];
         int adjCol = column + delCol[i];
         if (adjRow >= 0 && adjRow < mat.length && adjCol >= 0 && adjCol < mat[0].length
            && !visited[adjRow][adjCol] && mat[adjRow][adjCol] == 1) {
            helper(adjRow, adjCol, path + MAP[i], visited, mat, output);
            visited[adjRow][adjCol] = false;
         }
      }
   }
}
