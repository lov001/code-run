package practice.trees;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

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
