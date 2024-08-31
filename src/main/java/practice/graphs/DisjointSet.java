package practice.graphs;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

   List<Integer> rank = new ArrayList<>();
   List<Integer> parent = new ArrayList<>();
   List<Integer> size = new ArrayList<>();

   public DisjointSet(int n) {
      for (int i = 0; i <= n; i++) {
         rank.add(0);
         parent.add(i);
         size.add(1);
      }
   }

   public int findUltimateParent(int node) {
      if (node == parent.get(node)) {
         return node;
      }
      int ultimateParent = findUltimateParent(parent.get(node));
      parent.set(node, ultimateParent);
//      return parent.get(node);
      return ultimateParent;
   }

   public void unionByRank(int u, int v) {
      int ultimateParentOfU = findUltimateParent(u);
      int ultimateParentOfV = findUltimateParent(v);

      if (ultimateParentOfU == ultimateParentOfV) {
         return;
      } else if (rank.get(ultimateParentOfU) < rank.get(ultimateParentOfV)) {
         parent.set(ultimateParentOfU, ultimateParentOfV);
      } else if (rank.get(ultimateParentOfV) < rank.get(ultimateParentOfU)) {
         parent.set(ultimateParentOfV, ultimateParentOfU);
      } else {
         parent.set(ultimateParentOfV, ultimateParentOfU);
         int rankOfUltimateParentOfU = rank.get(ultimateParentOfU);
         rank.set(ultimateParentOfU, rankOfUltimateParentOfU + 1);
      }
   }

   public void unionBySize(int u, int v) {
      int ultimateParentOfU = findUltimateParent(u);
      int ultimateParentOfV = findUltimateParent(v);

      if (ultimateParentOfU == ultimateParentOfV) {
         return;
      } else if (size.get(ultimateParentOfU) < size.get(ultimateParentOfV)) {
         parent.set(ultimateParentOfU, ultimateParentOfV);
         size.set(ultimateParentOfV, size.get(ultimateParentOfU) + size.get(ultimateParentOfV));
      } else {
         parent.set(ultimateParentOfV, ultimateParentOfU);
         size.set(ultimateParentOfU, size.get(ultimateParentOfU) + size.get(ultimateParentOfV));
      }
   }
}
