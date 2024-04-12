package practice.trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

   public static List<Integer> inOrderTraversal(BinaryTreeNode root) {
      List<Integer> traversedList = new ArrayList<>();
      traverse(root, traversedList);
      return traversedList;
   }

   private static void traverse(BinaryTreeNode root, List<Integer> traversedList) {
      if (root == null) {
         return;
      }
      traverse(root.left, traversedList);
      traversedList.add(root.data);
      traverse(root.right, traversedList);
   }
}
