package practice.trees;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListOfDepthsTest {

   ListOfDepths classObj = new ListOfDepths();

   @Test
   void test_listOfDepths_expect2AsListSize_whenCurrentNodeIsRootNode() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree = new BinaryTreeNode(25, left1, right1);

      List<LinkedList<BinaryTreeNode>> list = classObj.depthList(tree);
      Assertions.assertEquals(3, list.size());
      Assertions.assertEquals(tree, list.get(0).get(0));
      Assertions.assertEquals(left1, list.get(1).get(0));
      Assertions.assertEquals(right1, list.get(1).get(1));
      Assertions.assertEquals(left11, list.get(2).get(0));
      Assertions.assertEquals(left12, list.get(2).get(1));
      Assertions.assertEquals(right11, list.get(2).get(2));
   }

   @Test
   void test_createLevelLinkedListUsingBFS_expect28_whenCurrentNodeIsRootNode() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(50, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(8, null, null);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(14, left11, null);
      BinaryTreeNode tree = new BinaryTreeNode(25, left1, right1);

      List<LinkedList<BinaryTreeNode>> listBFS = classObj.createLevelLinkedListUsingBFS(tree);

      Assertions.assertEquals(3, listBFS.size());
      Assertions.assertEquals(tree, listBFS.get(0).get(0));
      Assertions.assertEquals(left1, listBFS.get(1).get(0));
      Assertions.assertEquals(right1, listBFS.get(1).get(1));
      Assertions.assertEquals(left11, listBFS.get(2).get(0));
      Assertions.assertEquals(left12, listBFS.get(2).get(1));
      Assertions.assertEquals(right11, listBFS.get(2).get(2));
   }

}
