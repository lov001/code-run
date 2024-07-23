package practice.graphs;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PathWithMinimumEffort {

   public int minimumEffort(int rows, int columns, int[][] heights) {
      int[][] distance = new int[rows][columns];
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            distance[i][j] = Integer.MAX_VALUE;
         }
      }
      Queue<Triplet> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(x -> x.first));
      priorityQueue.add(new Triplet(0, 0, 0));
      distance[0][0] = 0;
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      while (!priorityQueue.isEmpty()) {
         Triplet node = priorityQueue.poll();
         int row = node.second;
         int column = node.third;
         int effort = node.first;
         if (row == rows - 1 && column == columns - 1) {
            return effort;
         }
         for (int i = 0; i < 4; i++) {
            int ro = row + delRow[i];
            int co = column + delCol[i];
            if (ro >= 0 && ro < rows && co >= 0 && co < columns
               && distance[ro][co] > effort) {
               int absoluteEffort = Math.abs(heights[ro][co] - heights[row][column]);
               int newEffort = Math.max(absoluteEffort, effort);
               if (newEffort < distance[ro][co]) {
                  distance[ro][co] = newEffort;
                  priorityQueue.add(new Triplet(newEffort, ro, co));
               }
            }
         }
      }
      return 0;
   }
}
