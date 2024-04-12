package practice.trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

   List<Integer> traversedList = new ArrayList<>();

   public List<Integer> inOrderTraversal(BinaryTreeNode root) {
      traverse(root);
      return traversedList;
   }

   private void traverse(BinaryTreeNode root) {
      if (root == null) {
         return;
      }
      traverse(root.left);
      traversedList.add(root.data);
      traverse(root.right);
   }
}
