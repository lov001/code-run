package leetcode.tree.binarytree.problem101;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    SymmetricTree classObj = new SymmetricTree();
    SymmetricTreeIterativeSolutionUsingStack classObj2 =
        new SymmetricTreeIterativeSolutionUsingStack();

    @Test
    void test_isSymmetric_expectTrue_whenTreesAreMirrorImages() {
        TreeNode left3 = new TreeNode(4, null, null);
        TreeNode right3 = new TreeNode(3, null, null);
        TreeNode left2 = new TreeNode(3, null, null);
        TreeNode right2 = new TreeNode(4, null, null);
        TreeNode left1 = new TreeNode(2, left2, right2);
        TreeNode right1 = new TreeNode(2, left3, right3);
        TreeNode tree = new TreeNode(1, left1, right1);

        Assertions.assertTrue(classObj.isSymmetric(tree));
        Assertions.assertTrue(classObj2.isSymmetric(tree));
    }

    @Test
    void test_isSymmetric_expectFalse_whenTreesAreNotMirrorImages() {
        TreeNode right3 = new TreeNode(3, null, null);
        TreeNode right2 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(2, null, right2);
        TreeNode right1 = new TreeNode(2, null, right3);
        TreeNode tree = new TreeNode(1, left1, right1);

        Assertions.assertFalse(classObj.isSymmetric(tree));
        Assertions.assertFalse(classObj2.isSymmetric(tree));
    }
}
