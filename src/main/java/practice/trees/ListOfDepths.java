package practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOfDepths {


   public List<LinkedList<BinaryTreeNode>> createLevelLinkedListUsingBFS(BinaryTreeNode root) {
      List<LinkedList<BinaryTreeNode>> result = new ArrayList<>();
      LinkedList<BinaryTreeNode> current = new LinkedList<>();
      if (root != null) {
         current.add(root);
      }
      while (current.size() > 0) {
         result.add(current);
         LinkedList<BinaryTreeNode> parents = current;
         current = new LinkedList<>();

         for (BinaryTreeNode parent : parents) {
            if (parent.left != null) {
               current.add(parent.left);
            }
            if (parent.right != null) {
               current.add(parent.right);
            }
         }
      }
      return result;
   }

   public List<LinkedList<BinaryTreeNode>> depthList(BinaryTreeNode root) {
      List<LinkedList<BinaryTreeNode>> lists = new ArrayList<>();
      createLevelLinkedListUsingPreOrderTraversal(root, lists, 0);
      return lists;
   }

   private void createLevelLinkedListUsingPreOrderTraversal(BinaryTreeNode root,
      List<LinkedList<BinaryTreeNode>> lists, int level) {
      if (root == null) {
         return;
      }
      LinkedList<BinaryTreeNode> list = null;
      if (lists.size() == level) {
         list = new LinkedList<>();
         lists.add(list);
      } else {
         list = lists.get(level);
      }
      list.add(root);
      createLevelLinkedListUsingPreOrderTraversal(root.left, lists, level + 1);
      createLevelLinkedListUsingPreOrderTraversal(root.right, lists, level + 1);
   }
}
