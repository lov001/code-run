package practice.trees;

import java.util.Stack;

public class SumOfLeftLeaves {

   public int sumOfLeftLeaves(BinaryTreeNode root) {
      if (root.left == null && root.right == null) {
         return 0;
      }
      int sum = 0;
      Stack<BinaryTreeNode> stack = new Stack<>();
      stack.push(root);

      while (!stack.isEmpty()) {
         BinaryTreeNode node = stack.pop();
         if (node.left != null) {
            if (node.left.left == null && node.left.right == null) {
               sum += node.left.data;
            } else {
               stack.push(node.left);
            }
         }
         if (node.right != null) {
            if (node.right.left != null || node.right.right != null) {
               stack.push(node.right);
            }
         }
      }
      return sum;
   }
}
