package practice.trees;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {

   public List<Integer> traverseBoundary(BinaryTreeNode root) {
      List<Integer> output = new ArrayList<>();
      if (root == null) {
         return output;
      }
      if (!isLeafNode(root)) {
         output.add(root.data);
      }
      addLeftBoundary(root, output);
      addLeafNodes(root, output);
      addRightBoundary(root, output);
      return output;
   }

   private void addLeftBoundary(BinaryTreeNode node, List<Integer> output) {
      BinaryTreeNode current = node.left;
      while (current != null) {
         if (!isLeafNode(current)) {
            output.add(current.data);
         }
         if (current.left != null) {
            current = current.left;
         } else {
            current = current.right;
         }
      }
   }

   private void addRightBoundary(BinaryTreeNode node, List<Integer> output) {
      BinaryTreeNode current = node.right;
      List<Integer> temp = new ArrayList<>();
      while (current != null) {
         if (!isLeafNode(current)) {
            temp.add(current.data);
         }
         if (current.right != null) {
            current = current.right;
         } else {
            current = current.left;
         }
      }
      for (int i = temp.size() - 1; i >= 0; --i) {
         output.add(temp.get(i));
      }
   }

   private void addLeafNodes(BinaryTreeNode node, List<Integer> output) {
      if (isLeafNode(node)) {
         output.add(node.data);
         return;
      }
      if (node.left != null) {
         addLeafNodes(node.left, output);
      }
      if (node.right != null) {
         addLeafNodes(node.right, output);
      }
   }

   private boolean isLeafNode(BinaryTreeNode node) {
      return node.left == null && node.right == null;
   }
}
