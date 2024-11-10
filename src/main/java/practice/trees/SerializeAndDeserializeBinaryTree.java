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
            continue;
         } else {
            serialisedString.append(node.data).append(" ");
         }
         queue.add(node.left);
         queue.add(node.right);
      }
      return serialisedString.substring(0, serialisedString.length() - 1);
   }

   public BinaryTreeNode deserializeTree(String serialized) {
      if (serialized.length() == 0) {
         return null;
      }
      String[] nodes = serialized.split(" ");
      Queue<BinaryTreeNode> queue = new LinkedList<>();
      BinaryTreeNode root = new BinaryTreeNode(Integer.parseInt(nodes[0]));
      queue.add(root);
      for (int i = 1; i < nodes.length; i++) {
         BinaryTreeNode parent = queue.poll();
         if (!nodes[i].equals("-1")) {
            BinaryTreeNode left = new BinaryTreeNode(Integer.parseInt(nodes[i]));
            queue.add(left);
            parent.left = left;
         }
         if (!nodes[++i].equals("-1")) {
            BinaryTreeNode right = new BinaryTreeNode(Integer.parseInt(nodes[i]));
            queue.add(right);
            parent.right = right;
         }
      }
      return root;
   }
}
