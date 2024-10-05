package practice.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

   public static List<Integer> inOrderTraversalIterative(BinaryTreeNode root) {
      List<Integer> traversedList = new ArrayList<>();
      if (root == null) {
         return traversedList;
      }
      Stack<BinaryTreeNode> stack = new Stack<>();
      BinaryTreeNode node = root;
      while (node != null || stack.size() > 0) {
         while (node != null) {
            stack.push(node);
            node = node.left;
         }
         node = stack.pop();
         traversedList.add(node.data);
         node = node.right;
      }
      return traversedList;
   }

   public static List<Integer> inOrderTraversal(BinaryTreeNode root) {
      List<Integer> traversedList = new ArrayList<>();
      traverse(root, traversedList);
      return traversedList;
   }

   private static void traverse(BinaryTreeNode root, List<Integer> traversedList) {
      if (root == null) {
         return;
      }
      traverse(root.left, traversedList);
      traversedList.add(root.data);
      traverse(root.right, traversedList);
   }
}
