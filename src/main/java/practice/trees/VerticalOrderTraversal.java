package practice.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {

   public List<List<Integer>> verticalTraversal(BinaryTreeNode root) {
      if (root == null) {
         return Collections.emptyList();
      }
      Map<Integer, Map<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
      Queue<Triplet> queue = new LinkedList<>();
      queue.add(new Triplet(root, 0, 0));
      while (!queue.isEmpty()) {
         int size = queue.size();
         for (int i = 0; i < size; i++) {
            Triplet triplet = queue.poll();
            BinaryTreeNode node = triplet.node;
            int level = triplet.row;
            int line = triplet.column;

            if (!map.containsKey(line)) {
               map.put(line, new TreeMap<>());
            }
            if (!map.get(line).containsKey(level)) {
               map.get(line).put(level, new PriorityQueue<>());
            }
            map.get(line).get(level).offer(node.data);

            if (node.left != null) {
               queue.add(new Triplet(node.left, level + 1, line - 1));
            }
            if (node.right != null) {
               queue.add(new Triplet(node.right, level + 1, line + 1));
            }
         }
      }
      List<List<Integer>> output = new ArrayList<>();
      for (Map<Integer, PriorityQueue<Integer>> ys : map.values()) {
         output.add(new ArrayList<>());
         for (PriorityQueue<Integer> nodes : ys.values()) {
            while (!nodes.isEmpty()) {
               output.get(output.size() - 1).add(nodes.poll());
            }
         }
      }

      return output;
   }

   public static class Triplet {

      BinaryTreeNode node;
      int row;
      int column;

      public Triplet(BinaryTreeNode node, int row, int column) {
         this.node = node;
         this.row = row;
         this.column = column;
      }
   }
}
