package practice.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CountDistinctIslands {

   public int countDistinctIslands(int[][] grid, String algorithm) {
      int rows = grid.length;
      int cols = grid[0].length;
      boolean[][] visited = new boolean[rows][cols];
      Set<List<String>> set = new HashSet<>();
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            if (!visited[i][j] && grid[i][j] == 1) {
               List<String> island = new ArrayList<>();
               if ("DFS".equalsIgnoreCase(algorithm)) {
                  dfs(grid, visited, island, i, j, i, j);
               } else {
                  bfs(grid, visited, island, i, j);
               }
               set.add(island);
            }
         }
      }
      return set.size();
   }

   private void dfs(int[][] grid, boolean[][] visited, List<String> island, int baseRow,
      int baseCol, int row, int col) {
      visited[row][col] = true;
      island.add(toString(Math.abs(baseRow - row), Math.abs(baseCol - col)));
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      for (int i = 0; i < 4; i++) {
         int ro = row + delRow[i];
         int co = col + delCol[i];
         if (ro >= 0 && ro < grid.length && co >= 0 && co < grid[0].length
            && !visited[ro][co] && grid[ro][co] == 1) {
            dfs(grid, visited, island, baseRow, baseCol, ro, co);
         }
      }
   }

   private void bfs(int[][] grid, boolean[][] visited, List<String> island, int baseRow,
      int baseCol) {
      visited[baseRow][baseCol] = true;
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(baseRow, baseCol));
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      while (!queue.isEmpty()) {
         Pair node = queue.poll();
         for (int i = 0; i < 4; i++) {
            int ro = node.first + delRow[i];
            int co = node.second + delCol[i];
            if (ro >= 0 && ro < grid.length && co >= 0 && co < grid[0].length
               && !visited[ro][co] && grid[ro][co] == 1) {
               visited[ro][co] = true;
               queue.add(new Pair(ro, co));
               island.add(toString(Math.abs(baseRow - ro), Math.abs(baseCol - co)));
            }
         }
      }
   }


   private String toString(int r, int c) {
      return r + " " + c;
   }
}
