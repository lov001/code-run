package practice.trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

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
