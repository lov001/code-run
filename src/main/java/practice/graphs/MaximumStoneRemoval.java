package practice.graphs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaximumStoneRemoval {

   public int maxRemove(int[][] stones, int n) {
      int maxRow = 0;
      int maxCol = 0;
      for (int i = 0; i < n; i++) {
         maxRow = Math.max(maxRow, stones[i][0]);
         maxCol = Math.max(maxCol, stones[i][1]);
      }
      DisjointSet ds = new DisjointSet(maxRow + maxCol + 1);
      Map<Integer, Integer> stoneMap = new HashMap<>();
      for (int i = 0; i < n; i++) {
         int nodeRow = stones[i][0];
         int nodeCol = stones[i][1] + maxRow + 1;
         ds.unionBySize(nodeRow, nodeCol);
         stoneMap.put(nodeRow, 1);
         stoneMap.put(nodeCol, 1);
      }
      int count = 0;
      for (Entry<Integer, Integer> entry : stoneMap.entrySet()) {
         if (ds.findUltimateParent(entry.getKey()) == entry.getKey()) {
            count++;
         }
      }
      return n - count;
   }
}
