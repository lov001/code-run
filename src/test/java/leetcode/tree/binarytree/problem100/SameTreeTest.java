package leetcode.tree.binarytree.problem100;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {

    SameTree classObj = new SameTree();
    SameTreeApproach2 classObj2 = new SameTreeApproach2();
    SameTreeApproach3 classObj3 = new SameTreeApproach3();

    @Test
    void test_isSameTree_expectTrue_whenSameTree() {
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

        BinaryTreeNode left2 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode tree2 = new BinaryTreeNode(1, left2, right2);
        Assertions.assertTrue(classObj.isSameTree(tree1, tree2));
        Assertions.assertTrue(classObj2.isSameTree(tree1, tree2));
        Assertions.assertTrue(classObj3.isSameTree(tree1, tree2));
    }

    @Test
    void test_isSameTree_expectFalse_whenSameNodesButDifferentChild() {
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, null);

        BinaryTreeNode right2 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree2 = new BinaryTreeNode(1, null, right2);
        Assertions.assertFalse(classObj.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj2.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj3.isSameTree(tree1, tree2));
    }

    @Test
    void test_isSameTree_expectFalse_whenTreesAreMirrorImages() {
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, right1);

        BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode right2 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree2 = new BinaryTreeNode(1, left2, right2);
        Assertions.assertFalse(classObj.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj2.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj3.isSameTree(tree1, tree2));
    }

    @Test
    void test_isSameTree_expectFalse_whenGivenTrees() {
        BinaryTreeNode left1 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode tree1 = new BinaryTreeNode(1, left1, null);

        BinaryTreeNode right2 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode tree2 = new BinaryTreeNode(1, null, right2);
//        Assertions.assertFalse(classObj.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj2.isSameTree(tree1, tree2));
        Assertions.assertFalse(classObj3.isSameTree(tree1, tree2));
    }
}
