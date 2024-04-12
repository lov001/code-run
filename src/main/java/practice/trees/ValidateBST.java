package practice.trees;

public class ValidateBST {

   private boolean flag = true;

   public boolean isBST(BinaryTreeNode root) {
      return validate(root);
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
      if (!((leftNodeValue <= root.data) && (root.data <= rightNodeValue))) {
         flag = false;
         return false;
      }
      validate(root.left);
      validate(root.right);
      return flag;
   }
}
