package practice.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

   public List<Integer> postOrderTraversalIterativeUsing2Stacks(BinaryTreeNode root) {
      List<Integer> traversedList = new ArrayList<>();
      if (root == null) {
         return traversedList;
      }
      Stack<BinaryTreeNode> stack1 = new Stack<>();
      Stack<BinaryTreeNode> stack2 = new Stack<>();
      stack1.push(root);
      while (!stack1.isEmpty()) {
         BinaryTreeNode node = stack1.pop();
         stack2.push(node);
         if (node.left != null) {
            stack1.push(node.left);
         }
         if (node.right != null) {
            stack1.push(node.right);
         }
      }
      while (!stack2.isEmpty()) {
         traversedList.add(stack2.pop().data);
      }
      return traversedList;
   }

   public List<Integer> postOrderTraversalIterativeUsing1Stack(BinaryTreeNode root) {
      List<Integer> traversedList = new ArrayList<>();
      if (root == null) {
         return traversedList;
      }
      Stack<BinaryTreeNode> stack1 = new Stack<>();
      BinaryTreeNode current = root;
      while (current != null || !stack1.isEmpty()) {
         if (current != null) {
            stack1.push(current);
            current = current.left;
         } else {
            BinaryTreeNode temp = stack1.peek().right;
            if (temp == null) {
               temp = stack1.pop();
               traversedList.add(temp.data);
               while (!stack1.isEmpty() && temp == stack1.peek().right) {
                  temp = stack1.pop();
                  traversedList.add(temp.data);
               }
            } else {
               current = temp;
            }
         }
      }
      return traversedList;
   }

   public List<Integer> postOrderTraversal(BinaryTreeNode root) {
      List<Integer> traversedList = new ArrayList<>();
      traverse(root, traversedList);
      return traversedList;
   }

   private void traverse(BinaryTreeNode root, List<Integer> traversedList) {
      if (root == null) {
         return;
      }
      traverse(root.left, traversedList);
      traverse(root.right, traversedList);
      traversedList.add(root.data);
   }
}
