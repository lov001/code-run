package practice.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

   public int orangesRotting(int[][] grid) {
      int maxTime = 0;
      int[][] visited = new int[grid.length][grid[0].length];
      for (int i = 0; i < grid.length; i++) {
         System.arraycopy(grid[i], 0, visited[i], 0, grid[0].length);
      }
      Queue<Triplet> queue = new LinkedList<>();
      for (int i = 0; i < grid.length; i++) {
         for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == 2) {
               queue.add(new Triplet(i, j, 0));
            }
         }
      }
      maxTime = bfs(grid, visited, maxTime, queue);
      for (int i = 0; i < grid.length; i++) {
         for (int j = 0; j < grid[0].length; j++) {
            if (visited[i][j] == 1) {
               return -1;
            }
         }
      }
      return maxTime;
   }

   private int bfs(int[][] grid, int[][] visited, int maxTime, Queue<Triplet> queue) {
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      while (!queue.isEmpty()) {
         Triplet orange = queue.poll();
         int ro = orange.first;
         int co = orange.second;
         int time = orange.third;
         for (int i = 0; i < delRow.length; i++) {
            int row = ro + delRow[i];
            int col = co + delCol[i];
            if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length
               && grid[row][col] == 1 && visited[row][col] != 2) {
               visited[row][col] = 2;
               Triplet triplet = new Triplet(row, col, time + 1);
               queue.add(triplet);
               maxTime = Math.max(triplet.third, maxTime);
            }
         }
      }
      return maxTime;
   }
}
