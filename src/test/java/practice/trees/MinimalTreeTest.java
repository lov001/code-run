package practice.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimalTreeTest {

   MinimalTree classObj = new MinimalTree();

   @Test
   void test_minimalTree_expectNull_whenArrayIsEmpty() {
      int[] array = {};
      Assertions.assertNull(classObj.minimalTree(array));
   }

   @Test
   void test_minimalTree_expectRootNode_whenArrayHasOnlyOneElement() {
      int[] array = {2};
      Assertions.assertEquals(2, classObj.minimalTree(array).data);
   }

   @Test
   void test_minimalTree_expectMinimalTree_whenArrayManyElements() {
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
      BinaryTreeNode tree = classObj.minimalTree(array);
      Assertions.assertEquals(4, tree.data);
      Assertions.assertEquals(2, tree.left.data);
      Assertions.assertEquals(6, tree.right.data);
      Assertions.assertEquals(1, tree.left.left.data);
      Assertions.assertEquals(3, tree.left.right.data);
      Assertions.assertEquals(5, tree.right.left.data);
      Assertions.assertEquals(7, tree.right.right.data);
      Assertions.assertEquals(8, tree.right.right.right.data);
   }
}
