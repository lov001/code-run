package practice.trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {

   public String serializeTree(BinaryTreeNode root) {
      StringBuilder serialisedString = new StringBuilder();
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      queue.add(root);
      while (!queue.isEmpty()) {
         BinaryTreeNode node = queue.poll();
         if (node == null) {
            serialisedString.append("-1").append(" ");
         } else {
            serialisedString.append(node.data).append(" ");
         }
         if (node != null) {
            queue.add(node.left);
            queue.add(node.right);
         }
      }
      return serialisedString.substring(0, serialisedString.length() - 1);
   }

//   public BinaryTreeNode deserializeTree(String serialized) {
//      if (serialized.length() == 0) {
//         return null;
//      }
//      String[] nodes = serialized.split(" ");
//      for (int i = 0; i < nodes.length; i++) {
//         BinaryTreeNode node = new BinaryTreeNode(Integer.parseInt(nodes[i]));
//      }
//      return null;
//   }
}
