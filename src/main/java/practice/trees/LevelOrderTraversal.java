package practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

   public List<List<Integer>> levelOrder(BinaryTreeNode root) {
      List<List<Integer>> traversal = new ArrayList<>();
      if (root == null) {
         return traversal;
      }
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      queue.offer(root);
      while (!queue.isEmpty()) {
         int levelNum = queue.size();
         List<Integer> subList = new ArrayList<>();
         for (int i = 0; i < levelNum; i++) {
            if (queue.peek().left != null) {
               queue.offer(queue.peek().left);
            }
            if (queue.peek().right != null) {
               queue.offer(queue.peek().right);
            }
            subList.add(queue.poll().data);
         }
         traversal.add(subList);
      }
      return traversal;
   }
}
