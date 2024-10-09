package practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

   public List<List<Integer>> zigzagLevelOrder(BinaryTreeNode root) {
      List<List<Integer>> output = new ArrayList<>();
      if (root == null) {
         return output;
      }
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      queue.offer(root);
      boolean leftToRight = true;
      while (!queue.isEmpty()) {
         int size = queue.size();
         int[] array = new int[size];
         for (int i = 0; i < size; i++) {
            BinaryTreeNode node = queue.poll();
            int index = leftToRight ? i : (size - i - 1);
            array[index] = node.data;

            if (node.left != null) {
               queue.offer(node.left);
            }
            if (node.right != null) {
               queue.offer(node.right);
            }
         }
         leftToRight = !leftToRight;
         List<Integer> list = new ArrayList<>();
         for (int j : array) {
            list.add(j);
         }
         output.add(list);
      }

      return output;
   }
}
