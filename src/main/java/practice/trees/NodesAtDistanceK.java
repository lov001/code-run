package practice.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class NodesAtDistanceK {

   public List<BinaryTreeNode> printNodesAtDistanceK(BinaryTreeNode root, BinaryTreeNode target,
      int K) {
      Map<BinaryTreeNode, BinaryTreeNode> parentTrack = new HashMap<>();
      markParent(root, parentTrack);
      Map<BinaryTreeNode, Boolean> visited = new HashMap<>();
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      queue.offer(target);
      visited.put(target, true);
      int currentLevel = 0;
      while (!queue.isEmpty()) {
         int size = queue.size();
         if (currentLevel == K) {
            break;
         }
         currentLevel++;
         for (int i = 0; i < size; i++) {
            BinaryTreeNode node = queue.poll();
            if (node.left != null && !visited.containsKey(node.left)) {
               queue.offer(node.left);
               visited.put(node.left, true);
            }
            if (node.right != null && !visited.containsKey(node.right)) {
               queue.offer(node.right);
               visited.put(node.right, true);
            }
            if (parentTrack.get(node) != null && !visited.containsKey(parentTrack.get(node))) {
               queue.offer(parentTrack.get(node));
               visited.put(parentTrack.get(node), true);
            }
         }
      }
      List<BinaryTreeNode> result = new ArrayList<>();
      while (!queue.isEmpty()) {
         result.add(queue.poll());
      }
      return result;
   }

   private void markParent(BinaryTreeNode root, Map<BinaryTreeNode, BinaryTreeNode> parentTrack) {
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      queue.offer(root);
      while (!queue.isEmpty()) {
         BinaryTreeNode node = queue.poll();
         if (node.left != null) {
            parentTrack.put(node.left, node);
            queue.offer(node.left);
         }
         if (node.right != null) {
            parentTrack.put(node.right, node);
            queue.offer(node.right);
         }
      }
   }
}
