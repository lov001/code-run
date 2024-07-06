package practice.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

   public int[][] floodFillBFS(int[][] image, int sr, int sc, int newColor, String algorithm) {
      int rows = image.length;
      int cols = image[0].length;
      int[][] updatedImage = new int[rows][cols];
      for (int i = 0; i < rows; i++) {
         System.arraycopy(image[i], 0, updatedImage[i], 0, cols);
      }
      int oldColor = image[sr][sc];
      if ("BFS".equalsIgnoreCase(algorithm)) {
         bfs(image, sr, sc, oldColor, newColor, updatedImage);
      } else {
         dfs(image, sr, sc, oldColor, newColor, updatedImage);
      }

      return updatedImage;
   }

   private void bfs(int[][] image, int row, int col, int oldColor, int newColor,
      int[][] updatedImage) {
      updatedImage[row][col] = newColor;
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(row, col));
      int maxRow = image.length;
      int maxCol = image[0].length;
      while (!queue.isEmpty()) {
         Pair pixel = queue.poll();
         int ro = pixel.first;
         int co = pixel.second;
         for (int delRow = -1; delRow <= 1; delRow++) {
            for (int delCol = -1; delCol <= 1; delCol++) {
               int curRow = ro + delRow;
               int curCol = co + delCol;
               if (curRow >= 0 && curRow < maxRow && curCol >= 0 && curCol < maxCol
                  && Math.abs(delRow) != Math.abs(delCol) && image[curRow][curCol] == oldColor
                  && updatedImage[curRow][curCol] != newColor) {
                  updatedImage[curRow][curCol] = newColor;
                  queue.add(new Pair(curRow, curCol));
               }
            }
         }
      }
   }

   private void dfs(int[][] image, int row, int col, int oldColor, int newColor,
      int[][] updatedImage) {
      updatedImage[row][col] = newColor;
      int maxRow = image.length;
      int maxCol = image[0].length;
      for (int delRow = -1; delRow <= 1; delRow++) {
         for (int delCol = -1; delCol <= 1; delCol++) {
            int curRow = row + delRow;
            int curCol = col + delCol;
            if (curRow >= 0 && curRow < maxRow && curCol >= 0 && curCol < maxCol
               && Math.abs(delRow) != Math.abs(delCol) && image[curRow][curCol] == oldColor
               && updatedImage[curRow][curCol] != newColor) {
               updatedImage[curRow][curCol] = newColor;
               dfs(image, curRow, curCol, oldColor, newColor, updatedImage);
            }
         }
      }
   }
}
