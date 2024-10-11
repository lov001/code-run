package practice.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class RightViewOfBinaryTree {

   public List<Integer> getRightView(BinaryTreeNode root) {
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
         int level = pair.level;
         if (node.left != null) {
            queue.offer(new Pair(node.left, level + 1));
         }
         if (node.right != null) {
            queue.offer(new Pair(node.right, level + 1));
         }
         map.put(level, node.data);

      }
      for (Entry<Integer, Integer> keys : map.entrySet()) {
         output.add(keys.getValue());
      }
      return output;
   }

   public static class Pair {

      BinaryTreeNode node;
      int level;

      public Pair(BinaryTreeNode node, int level) {
         this.node = node;
         this.level = level;
      }
   }
}
