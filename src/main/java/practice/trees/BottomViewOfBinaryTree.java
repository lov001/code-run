package practice.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {

   public List<Integer> getBottomView(BinaryTreeNode root) {
      if (root == null) {
         return Collections.emptyList();
      }
      Queue<Pair> queue = new LinkedList<>();
      queue.offer(new Pair(root, 0));
      List<Integer> output = new ArrayList<>();
      TreeMap<Integer, Integer> map = new TreeMap<>();
      while (!queue.isEmpty()) {
         Pair pair = queue.poll();
         BinaryTreeNode node = pair.node;
         int vertical = pair.vertical;
         if (node.left != null) {
            queue.offer(new Pair(node.left, vertical - 1));
         }
         if (node.right != null) {
            queue.offer(new Pair(node.right, vertical + 1));
         }
         map.put(vertical, node.data);

      }
      for (Entry<Integer, Integer> keys : map.entrySet()) {
         output.add(keys.getValue());
      }
      return output;
   }

   public static class Pair {

      BinaryTreeNode node;
      int vertical;

      public Pair(BinaryTreeNode node, int vertical) {
         this.node = node;
         this.vertical = vertical;
      }
   }
}
