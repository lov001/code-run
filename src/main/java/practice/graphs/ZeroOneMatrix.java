package practice.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {

   public int[][] nearest(int[][] grid) {
      int rows = grid.length;
      int columns = grid[0].length;
      boolean[][] visited = new boolean[rows][columns];
      int[][] distance = new int[rows][columns];
      Queue<Triplet> queue = new LinkedList<>();
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (grid[i][j] == 1) {
               queue.add(new Triplet(i, j, 0));
            }
         }
      }
      bfs(visited, distance, grid, queue);
      return distance;
   }

   private void bfs(boolean[][] visited, int[][] distance, int[][] grid, Queue<Triplet> queue) {
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      while (!queue.isEmpty()) {
         Triplet node = queue.poll();
         int ro = node.first;
         int co = node.second;
         int dist = node.third;
         visited[ro][co] = true;
         for (int i = 0; i < 4; i++) {
            int nRow = ro + delRow[i];
            int nCol = co + delCol[i];
            if (nRow >= 0 && nRow < grid.length && nCol >= 0 && nCol < grid[0].length
               && !visited[nRow][nCol] && grid[nRow][nCol] != 1) {
               visited[nRow][nCol] = true;
               distance[nRow][nCol] = dist + 1;
               queue.add(new Triplet(nRow, nCol, dist + 1));
            }
         }
      }
   }
}
