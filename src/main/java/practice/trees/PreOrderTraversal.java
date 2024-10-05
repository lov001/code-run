package practice.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

   public List<Integer> preOrderTraversalIterative(BinaryTreeNode root) {
      List<Integer> traversedList = new ArrayList<>();
      if (root == null) {
         return traversedList;
      }
      Stack<BinaryTreeNode> stack = new Stack<>();
      stack.add(root);
      while (!stack.isEmpty()) {
         BinaryTreeNode node = stack.pop();
         traversedList.add(node.data);
         if (node.right != null) {
            stack.add(node.right);
         }
         if (node.left != null) {
            stack.add(node.left);
         }
      }
      return traversedList;
   }

   public List<Integer> preOrderTraversal(BinaryTreeNode root) {
      List<Integer> traversedList = new ArrayList<>();
      traverse(root, traversedList);
      return traversedList;
   }

   private void traverse(BinaryTreeNode root, List<Integer> traversedList) {
      if (root == null) {
         return;
      }
      traversedList.add(root.data);
      traverse(root.left, traversedList);
      traverse(root.right, traversedList);
   }
}
