package practice.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BSTSequence {

   public List<LinkedList<Integer>> allSequences(BinaryTreeNode root) {
      List<LinkedList<Integer>> result = new ArrayList<>();
      if (root == null) {
         result.add(new LinkedList<>());
         return result;
      }

      LinkedList<Integer> prefix = new LinkedList<>();
      prefix.add(root.data);

      List<LinkedList<Integer>> leftLists = allSequences(root.left);
      List<LinkedList<Integer>> rightLists = allSequences(root.right);

      for (LinkedList<Integer> listLeft : leftLists) {
         for (LinkedList<Integer> listRight : rightLists) {
            List<LinkedList<Integer>> weaved = new ArrayList<>();
            weave(listLeft, listRight, weaved, prefix);
            result.addAll(weaved);
         }
      }
      return result;
   }

   private void weave(LinkedList<Integer> listLeft, LinkedList<Integer> listRight,
      List<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
      if (listLeft.isEmpty() || listRight.isEmpty()) {
         LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
         result.addAll(listLeft);
         result.addAll(listRight);
         results.add(result);
         return;
      }

      int headFirst = listLeft.removeFirst();
      prefix.addLast(headFirst);
      weave(listLeft, listRight, results, prefix);
      prefix.removeLast();
      listLeft.add(headFirst);

      int headSecond = listRight.removeFirst();
      prefix.addLast(headSecond);
      weave(listLeft, listRight, results, prefix);
      prefix.removeLast();
      listRight.add(headSecond);
   }
}
