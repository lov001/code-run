package practice.trees;


import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstCommonAncestorTest {

   FirstCommonAncestor classObj = new FirstCommonAncestor();

   @Test
   void test_commonAncestor_expect1_whenRootIsTheCommonAncestor() {
      BinaryTreeNode left = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right = new BinaryTreeNode(2, null, null);
      BinaryTreeNode root = new BinaryTreeNode(1, left, right);
      Assertions.assertEquals(root, classObj.commonAncestor(root, left, right));
   }

   @Test
   void test_commonAncestor_expectNull_whenTreeHasNoNodes() {
      Assertions.assertNull(classObj.commonAncestor(null, null, null));
   }

   @Test
   void test_commonAncestor_expect10_whenBothNodesAreOnSameSide() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right31 = new BinaryTreeNode(17, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(15, null, right31);
      BinaryTreeNode left31 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right32 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(5, left31, right32);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(10, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(20, left1, right1);

      Assertions.assertEquals(left1, classObj.commonAncestor(tree1, right32, right11));
   }

   @Test
   void test_commonAncestor_expect20_whenBothNodesAreOnSameSide() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right31 = new BinaryTreeNode(17, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(15, null, right31);
      BinaryTreeNode left31 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right32 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(5, left31, right32);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(10, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(20, left1, right1);

      Assertions.assertEquals(tree1, classObj.commonAncestor(tree1, right32, right1));
   }

   @Test
   void test_commonAncestor_expect10_whenBothNodesAreParentChild() {
      BinaryTreeNode left12 = new BinaryTreeNode(28, null, null);
      BinaryTreeNode right31 = new BinaryTreeNode(17, null, null);
      BinaryTreeNode right11 = new BinaryTreeNode(15, null, right31);
      BinaryTreeNode left31 = new BinaryTreeNode(3, null, null);
      BinaryTreeNode right32 = new BinaryTreeNode(7, null, null);
      BinaryTreeNode left11 = new BinaryTreeNode(5, left31, right32);
      BinaryTreeNode right1 = new BinaryTreeNode(30, left12, right11);
      BinaryTreeNode left1 = new BinaryTreeNode(10, left11, right11);
      BinaryTreeNode tree1 = new BinaryTreeNode(20, left1, right1);

      Assertions.assertEquals(right11, classObj.commonAncestor(tree1, right11, right31));
   }

}

