package leetcode.tree.binarytree.problem101;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    SymmetricTree classObj = new SymmetricTree();
    SymmetricTreeIterativeSolutionUsingStack classObj2 =
        new SymmetricTreeIterativeSolutionUsingStack();

    @Test
    void test_isSymmetric_expectTrue_whenTreesAreMirrorImages() {
        BinaryTreeNode left3 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode right3 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left2 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode right2 = new BinaryTreeNode(4, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
        BinaryTreeNode right1 = new BinaryTreeNode(2, left3, right3);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

        Assertions.assertTrue(classObj.isSymmetric(tree));
        Assertions.assertTrue(classObj2.isSymmetric(tree));
    }

    @Test
    void test_isSymmetric_expectFalse_whenTreesAreNotMirrorImages() {
        BinaryTreeNode right3 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, right2);
        BinaryTreeNode right1 = new BinaryTreeNode(2, null, right3);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);

        Assertions.assertFalse(classObj.isSymmetric(tree));
        Assertions.assertFalse(classObj2.isSymmetric(tree));
    }
}
