package practice.trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BSTSequenceTest {

   BSTSequence classObj = new BSTSequence();

   @Test
   void test_allSequences_expectListOfSize2_whenTreeHas3Nodes() {
      BinaryTreeNode left = new BinaryTreeNode(1, null, null);
      BinaryTreeNode right = new BinaryTreeNode(3, null, null);
      BinaryTreeNode root = new BinaryTreeNode(2, left, right);
      List<LinkedList<Integer>> expected = new ArrayList<>();
      LinkedList<Integer> list1 = new LinkedList<>();
      list1.add(2);
      list1.add(1);
      list1.add(3);
      LinkedList<Integer> list2 = new LinkedList<>();
      list2.add(2);
      list2.add(3);
      list2.add(1);
      expected.add(list1);
      expected.add(list2);
      List<LinkedList<Integer>> actual = classObj.allSequences(root);
      for (int i = 0; i < actual.size(); i++) {
         for (int j = 0; j < actual.get(i).size(); j++) {
            Assertions.assertEquals(expected.get(i).get(j), actual.get(i).get(j));
         }
      }
   }

   @Test
   void test_allSequences_expectEmptyList_whenTreeHasNoNodes() {
      List<LinkedList<Integer>> actual = classObj.allSequences(null);
      Assertions.assertEquals(1, actual.size());
      Assertions.assertEquals(0, actual.get(0).size());
   }

   @Test
   void test_allSequences_expectListOfSize1_whenTreeHasOnlyRootNode() {
      BinaryTreeNode root = new BinaryTreeNode(1, null, null);
      List<LinkedList<Integer>> actual = classObj.allSequences(root);
      Assertions.assertEquals(1, actual.size());
      Assertions.assertEquals(1, actual.get(0).size());
      Assertions.assertEquals(1, actual.get(0).get(0));
   }

   @Test
   void test_allSequences_expectListOfSize20_whenTreeIsBST() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode root = new BinaryTreeNode(25, left1, right1);

      List<LinkedList<Integer>> expected = new ArrayList<>();
      LinkedList<Integer> list1 = new LinkedList<>();
      list1.add(25);
      list1.add(14);
      list1.add(8);
      list1.add(30);
      list1.add(28);
      list1.add(50);
      LinkedList<Integer> list2 = new LinkedList<>();
      list2.add(25);
      list2.add(14);
      list2.add(30);
      list2.add(8);
      list2.add(28);
      list2.add(50);
      LinkedList<Integer> list3 = new LinkedList<>();
      list3.add(25);
      list3.add(14);
      list3.add(30);
      list3.add(28);
      list3.add(8);
      list3.add(50);
      expected.add(list1);
      expected.add(list2);
      expected.add(list3);
      List<LinkedList<Integer>> actual = classObj.allSequences(root);
      Assertions.assertEquals(20, actual.size());
      for (int i = 0; i < 3; i++) {
         Assertions.assertEquals(6, actual.get(i).size());
         for (int j = 0; j < actual.get(i).size(); j++) {
            Assertions.assertEquals(expected.get(i).get(j), actual.get(i).get(j));
         }
      }
   }

}

