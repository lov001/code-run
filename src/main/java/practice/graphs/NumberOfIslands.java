package practice.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

   public int numberOfIslands(char[][] grid) {
      int count = 0;
      int rows = grid.length;
      int columns = grid[0].length;
      boolean[][] visited = new boolean[rows][columns];
      for (int row = 0; row < rows; row++) {
         for (int column = 0; column < columns; column++) {
            if (grid[row][column] == '1' && !visited[row][column]) {
               bfs(visited, grid, row, column);
               count++;
            }
         }
      }
      return count;
   }

   private void bfs(boolean[][] visited, char[][] grid, int ro, int co) {
      visited[ro][co] = true;
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(ro, co));

      int n = grid.length;
      int m = grid[0].length;
      while (!queue.isEmpty()) {
         Pair pair = queue.poll();
         int currentRow = pair.first;
         int currentColumn = pair.second;
         for (int delRow = -1; delRow <= 1; delRow++) {
            for (int delCol = -1; delCol <= 1; delCol++) {
               int nRow = currentRow + delRow;
               int nCol = currentColumn + delCol;
               if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m
                  && grid[nRow][nCol] == '1' && !visited[nRow][nCol]) {
                  visited[nRow][nCol] = true;
                  queue.add(new Pair(nRow, nCol));
               }
            }
         }
      }
   }

   static class Pair {

      int first;
      int second;

      public Pair(int first, int second) {
         this.first = first;
         this.second = second;
      }
   }
}
