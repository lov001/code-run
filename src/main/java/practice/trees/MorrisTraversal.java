package practice.trees;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversal {

   public static List<Integer> getInOrderTraversal(BinaryTreeNode root) {
      BinaryTreeNode current = root;
      List<Integer> inorder = new ArrayList<>();
      while (current != null) {
         if (current.left == null) {
            inorder.add(current.data);
            current = current.right;
         } else {
            BinaryTreeNode prev = current.left;
            while (prev.right != null && prev.right != current) {
               prev = prev.right;
            }
            if (prev.right == null) {
               prev.right = current;
               current = current.left;
            } else {
               prev.right = null;
               inorder.add(current.data);
               current = current.right;
            }
         }
      }
      return inorder;
   }

   public static List<Integer> getPreOrderTraversal(BinaryTreeNode root) {
      BinaryTreeNode current = root;
      List<Integer> inorder = new ArrayList<>();
      while (current != null) {
         if (current.left == null) {
            inorder.add(current.data);
            current = current.right;
         } else {
            BinaryTreeNode prev = current.left;
            while (prev.right != null && prev.right != current) {
               prev = prev.right;
            }
            if (prev.right == null) {
               prev.right = current;
               inorder.add(current.data);
               current = current.left;
            } else {
               prev.right = null;
               current = current.right;
            }
         }
      }
      return inorder;
   }
}
