package practice.trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MinimumTimeToBurnTree {

   public int timeToBurnTree(BinaryTreeNode root, int start) {
      if (root == null || root.left == null && root.right == null) {
         return 0;
      }
      Map<BinaryTreeNode, BinaryTreeNode> parentTrack = new HashMap<>();
      BinaryTreeNode target = markParent(root, parentTrack, start);
      Map<BinaryTreeNode, Boolean> visited = new HashMap<>();
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      queue.offer(target);
      visited.put(target, true);
      int currentLevel = 0;
      while (!queue.isEmpty()) {
         int size = queue.size();
         int flag = 0;
         for (int i = 0; i < size; i++) {
            BinaryTreeNode node = queue.poll();
            if (node.left != null && !visited.containsKey(node.left)) {
               flag = 1;
               queue.offer(node.left);
               visited.put(node.left, true);
            }
            if (node.right != null && !visited.containsKey(node.right)) {
               flag = 1;
               queue.offer(node.right);
               visited.put(node.right, true);
            }
            if (parentTrack.get(node) != null && !visited.containsKey(parentTrack.get(node))) {
               flag = 1;
               queue.offer(parentTrack.get(node));
               visited.put(parentTrack.get(node), true);
            }
         }
         if (flag == 1) {
            currentLevel++;
         }
      }
      return currentLevel;
   }

   private BinaryTreeNode markParent(BinaryTreeNode root,
      Map<BinaryTreeNode, BinaryTreeNode> parentTrack, int target) {
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      queue.offer(root);
      BinaryTreeNode start = null;
      while (!queue.isEmpty()) {
         BinaryTreeNode node = queue.poll();
         if (node.data == target) {
            start = node;
         }
         if (node.left != null) {
            parentTrack.put(node.left, node);
            queue.offer(node.left);
         }
         if (node.right != null) {
            parentTrack.put(node.right, node);
            queue.offer(node.right);
         }
      }
      return start;
   }
}
