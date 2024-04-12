package practice.trees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ValidateBST {


   public boolean isBST(BinaryTreeNode root) {
      return validate(root);
   }

   public boolean isBSTUsingInOrderTraversal(BinaryTreeNode root) {
      List<Integer> traversedList = InOrderTraversal.inOrderTraversal(root);
      List<Integer> copy = new ArrayList<>(traversedList);
      copy.sort(Comparator.naturalOrder());
      return traversedList.equals(copy);
   }

   private boolean validate(BinaryTreeNode root) {
      if (root == null) {
         return true;
      }
      int leftNodeValue = Integer.MIN_VALUE;
      int rightNodeValue = Integer.MAX_VALUE;
      if (root.left != null) {
         leftNodeValue = root.left.data;
      }
      if (root.right != null) {
         rightNodeValue = root.right.data;
      }
      if ((leftNodeValue <= root.data) && (root.data <= rightNodeValue)) {
         return validate(root.left) && validate(root.right);
      }
      return false;
   }
}
