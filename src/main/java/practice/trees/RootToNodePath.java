package practice.trees;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {

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
