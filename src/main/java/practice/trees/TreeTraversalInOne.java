package practice.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversalInOne {

   private final List<Integer> preOrder = new ArrayList<>();
   private final List<Integer> inOrder = new ArrayList<>();
   private final List<Integer> postOrder = new ArrayList<>();

   public void preInPostOrderTraversal(BinaryTreeNode root) {
      if (root == null) {
         return;
      }
      Stack<Pair> stack = new Stack<>();
      stack.push(new Pair(root, 1));
      while (!stack.isEmpty()) {
         Pair temp = stack.pop();
         if (temp.number == 1) {
            preOrder.add(temp.node.data);
            temp.number++;
            stack.push(temp);
            if (temp.node.left != null) {
               stack.push(new Pair(temp.node.left, 1));
            }
         } else if (temp.number == 2) {
            inOrder.add(temp.node.data);
            temp.number++;
            stack.push(temp);
            if (temp.node.right != null) {
               stack.push(new Pair(temp.node.right, 1));
            }
         } else if (temp.number == 3) {
            postOrder.add(temp.node.data);
         }
      }
   }

   public List<Integer> findPreOrderTraversal() {
      return this.preOrder;
   }

   public List<Integer> findInOrderTraversal() {
      return this.inOrder;
   }

   public List<Integer> findPostOrderTraversal() {
      return this.postOrder;
   }

   private static class Pair {

      BinaryTreeNode node;
      int number;

      public Pair(BinaryTreeNode node, int number) {
         this.node = node;
         this.number = number;
      }
   }
}
