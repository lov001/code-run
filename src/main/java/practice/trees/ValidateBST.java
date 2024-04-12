package practice.trees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ValidateBST {


   public boolean isBST(BinaryTreeNode root) {
      // will fail if we remove right equality condition
      return validate(root);
   }

   public boolean isBSTUsingInOrderTraversal(BinaryTreeNode root) {
      // will not work if tree has duplicate elements
      // since we don't use the array except for comparison, we can just keep track of last visited element
      List<Integer> traversedList = InOrderTraversal.inOrderTraversal(root);
      List<Integer> copy = new ArrayList<>(traversedList);
      copy.sort(Comparator.naturalOrder());
      return traversedList.equals(copy);
   }

   public boolean isBSTUsingMinMax(BinaryTreeNode root) {
      return validateMinMax(root, null, null);
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

   private boolean validateMinMax(BinaryTreeNode root, Integer min, Integer max) {
      if (root == null) {
         return true;
      }
      if ((min != null && root.data <= min) || (max != null && root.data > max)) {
         return false;
      }
      if (!validateMinMax(root.left, min, root.data) || !validateMinMax(root.right, root.data,
         max)) {
         return false;
      }
      return true;
   }
}
