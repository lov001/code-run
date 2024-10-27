package practice.trees;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NodesAtDistanceKTest {

   NodesAtDistanceK classObj = new NodesAtDistanceK();

   @Test
   void test_printNodesAtDistanceK_expect3And6_whenNoOfNodeIs6() {
      BinaryTreeNode left13 = new BinaryTreeNode(6, null, null);
      BinaryTreeNode left12 = new BinaryTreeNode(4, left13, null);
      BinaryTreeNode right11 = new BinaryTreeNode(5, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode left1 = new BinaryTreeNode(2, left12, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);
      List<BinaryTreeNode> expected = new ArrayList<>();
      expected.add(right1);
      expected.add(left13);
      List<BinaryTreeNode> actual = classObj.printNodesAtDistanceK(tree1, right11, 3);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertEquals(expected.get(1), actual.get(0));
      Assertions.assertEquals(expected.get(0), actual.get(1));
   }
}
