package practice.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInBinaryMaze {

   int shortestPath(int[][] grid, int[] source, int[] destination) {
      int rowLength = grid.length;
      int columnLength = grid[0].length;
      if (source[0] == destination[0] && source[1] == destination[1]) {
         return 0;
      }
      int[][] distance = new int[rowLength][columnLength];
      for (int i = 0; i < rowLength; i++) {
         for (int j = 0; j < columnLength; j++) {
            distance[i][j] = Integer.MAX_VALUE;
         }
      }
      distance[source[0]][source[1]] = 0;
      Queue<Triplet> queue = new LinkedList<>();
      queue.add(new Triplet(0, source[0], source[1]));
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      while (!queue.isEmpty()) {
         Triplet tripletNode = queue.poll();
         int ro = tripletNode.second;
         int co = tripletNode.third;
         int wt = tripletNode.first;
         for (int i = 0; i < 4; i++) {
            int adjRow = ro + delRow[i];
            int adjCol = co + delCol[i];
            if (adjRow >= 0 && adjRow < rowLength && adjCol >= 0 && adjCol < columnLength
               && grid[adjRow][adjCol] == 1 && distance[adjRow][adjCol] > wt + 1) {
               distance[adjRow][adjCol] = wt + 1;
               queue.add(new Triplet(wt + 1, adjRow, adjCol));
               if (adjRow == destination[0] && adjCol == destination[1]) {
                  return wt + 1;
               }
            }
         }
      }
      return -1;
   }
}
