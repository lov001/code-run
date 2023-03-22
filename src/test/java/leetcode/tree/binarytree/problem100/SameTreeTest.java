package leetcode.tree.binarytree.problem100;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {

    SameTree classObj = new SameTree();
    SameTreeApproach2 classObj2 = new SameTreeApproach2();

    @Test
    void test_isSameTree_expectTrue_whenSameTree() {
        TreeNode left1 = new TreeNode(2, null, null);
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode tree1 = new TreeNode(1, left1, right1);

        TreeNode left2 = new TreeNode(2, null, null);
        TreeNode right2 = new TreeNode(3, null, null);
        TreeNode tree2 = new TreeNode(1, left2, right2);
        Assertions.assertTrue(classObj.isSameTree(tree1, tree2));
        Assertions.assertTrue(classObj2.isSameTree(tree1, tree2));
    }

    @Test
    void test_isSameTree_expectFalse_whenSameNodesButDifferentChild() {
        TreeNode left1 = new TreeNode(2, null, null);
        TreeNode tree1 = new TreeNode(1, left1, null);

        TreeNode right2 = new TreeNode(2, null, null);
        TreeNode tree2 = new TreeNode(1, null, right2);
        Assertions.assertFalse(classObj.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj2.isSameTree(tree1, tree2));
    }

    @Test
    void test_isSameTree_expectFalse_whenTreesAreMirrorImages() {
        TreeNode left1 = new TreeNode(2, null, null);
        TreeNode right1 = new TreeNode(1, null, null);
        TreeNode tree1 = new TreeNode(1, left1, right1);

        TreeNode left2 = new TreeNode(1, null, null);
        TreeNode right2 = new TreeNode(2, null, null);
        TreeNode tree2 = new TreeNode(1, left2, right2);
        Assertions.assertFalse(classObj.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj2.isSameTree(tree1, tree2));
    }

    @Test
    void test_isSameTree_expectFalse_whenGivenTrees() {
        TreeNode left1 = new TreeNode(1, null, null);
        TreeNode tree1 = new TreeNode(1, left1, null);

        TreeNode right2 = new TreeNode(1, null, null);
        TreeNode tree2 = new TreeNode(1, null, right2);
//        Assertions.assertFalse(classObj.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj2.isSameTree(tree1, tree2));
    }
}
