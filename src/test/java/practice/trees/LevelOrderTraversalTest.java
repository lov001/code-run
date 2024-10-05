package practice.trees;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LevelOrderTraversalTest {

   LevelOrderTraversal classObj = new LevelOrderTraversal();

   @Test
   void test_levelOrder_expectTraversedList_whenNoOfNodeIs5() {
      BinaryTreeNode left12 = new BinaryTreeNode(15, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(20, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(9, null, null);
      BinaryTreeNode tree1 = new BinaryTreeNode(3, left1, right1);
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(3));
      expected.add(List.of(9, 20));
      expected.add(List.of(15, 7));
      List<List<Integer>> actual = classObj.levelOrder(tree1);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertEquals(expected.get(0), actual.get(0));
      Assertions.assertEquals(expected.get(1), actual.get(1));
      Assertions.assertEquals(expected.get(2), actual.get(2));
   }
}
