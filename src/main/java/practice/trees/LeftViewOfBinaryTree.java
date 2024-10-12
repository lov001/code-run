package practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class LeftViewOfBinaryTree {

   public List<Integer> printLeftViewIterative(BinaryTreeNode root) {
      List<Integer> output = new ArrayList<>();
      if (root == null) {
         return output;
      }
      Queue<Pair> queue = new LinkedList<>();
      queue.offer(new Pair(root, 0));
      Map<Integer, BinaryTreeNode> map = new TreeMap<>();
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
         if (!map.containsKey(level)) {
            map.put(level, node);
         }
      }
      for (Map.Entry<Integer, BinaryTreeNode> entry : map.entrySet()) {
         output.add(entry.getValue().data);
         System.out.println(entry.getValue().data);
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
