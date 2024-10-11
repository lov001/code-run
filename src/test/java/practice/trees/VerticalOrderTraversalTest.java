package practice.trees;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerticalOrderTraversalTest {

   VerticalOrderTraversal classObj = new VerticalOrderTraversal();

   @Test
   void test_verticalTraversal_expectList_whenTreeIsBST() {
      BinaryTreeNode left21 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right21 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left21, right21);
      BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(3, left1, right1);

      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(9));
      expected.add(List.of(3, 15));
      expected.add(List.of(20));
      expected.add(List.of(7));
      List<List<Integer>> actual = classObj.verticalTraversal(tree1);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertEquals(expected.get(i), actual.get(i));
      }
   }

   @Test
   void test_verticalTraversal_expectList_whenTree() {
      BinaryTreeNode left21 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode right21 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, left21, right21);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(4));
      expected.add(List.of(2));
      expected.add(List.of(1, 5, 6));
      expected.add(List.of(3));
      expected.add(List.of(7));
      List<List<Integer>> actual = classObj.verticalTraversal(tree1);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertEquals(expected.get(i), actual.get(i));
      }
   }

   @Test
   void test_verticalTraversal_expectList_whenTreeIs() {
      BinaryTreeNode left21 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode right21 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(4, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, right11, right21);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left11, left21);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(4));
      expected.add(List.of(2));
      expected.add(List.of(1, 5, 6));
      expected.add(List.of(3));
      expected.add(List.of(7));
      List<List<Integer>> actual = classObj.verticalTraversal(tree1);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertEquals(expected.get(i), actual.get(i));
      }
   }
}
