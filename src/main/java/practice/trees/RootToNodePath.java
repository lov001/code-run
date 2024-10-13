package practice.trees;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {

   public List<Integer> pathInATreeOptimised(BinaryTreeNode root, int x) {
      List<Integer> output = new ArrayList<>();
      if (root == null) {
         return output;
      }
      inOrderTraversalOptimised(root, x, output);
      return output;
   }

   private boolean inOrderTraversalOptimised(BinaryTreeNode node, int x, List<Integer> output) {
      if (node == null) {
         return false;
      }
      output.add(node.data);
      if (node.data == x) {
         return true;
      }
      if (inOrderTraversalOptimised(node.left, x, output)
         || inOrderTraversalOptimised(node.right, x, output)) {
         return true;
      }

      output.remove(output.size() - 1);
      return false;
   }

   public List<Integer> pathInATree(BinaryTreeNode root, int x) {
      List<Integer> output = new ArrayList<>();
      if (root == null) {
         return output;
      }
      inOrderTraversal(root, x, output);
      return output;
   }

   private void inOrderTraversal(BinaryTreeNode node, int x, List<Integer> output) {
      if (node == null) {
         return;
      }
      if (node.data == x) {
         output.add(node.data);
         return;
      }
      output.add(node.data);
      if (node.left != null) {
         inOrderTraversal(node.left, x, output);
      }
      if (node.right != null) {
         inOrderTraversal(node.right, x, output);
      }
      if (output.get(output.size() - 1) != x) {
         output.remove(output.size() - 1);
      }
   }
}
