package practice.trees.bst;

import java.util.ArrayList;
import practice.trees.BinaryTreeNode;

public class InOrderSuccessorAndPredecessorInBst {

   public ArrayList<Integer> findPreSuc(BinaryTreeNode root, int key) {
      BinaryTreeNode predecessor = null;
      BinaryTreeNode successor = null;

      BinaryTreeNode current = root;

      while (current != null) {
         if (key < current.data) {
            successor = current;
            current = current.left;
         } else {
            current = current.right;
         }
      }
      BinaryTreeNode node = root;
      while (node != null) {
         if (key > node.data) {
            predecessor = node;
            node = node.right;
         } else {
            node = node.left;
         }
      }
      ArrayList<Integer> response = new ArrayList<>();
      response.add(predecessor != null ? predecessor.data : -1);
      response.add(successor != null ? successor.data : -1);
      return response;
   }
}
