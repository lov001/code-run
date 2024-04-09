package leetcode.tree.binarytree.problem94;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InorderTraversalUsingStackTest {

    InorderTraversalUsingStack classObj = new InorderTraversalUsingStack();

    @Test
    void test_inorderTraversal_expectOrderedList_whenTreeHasNodes() {
        BinaryTreeNode left = new BinaryTreeNode(3, null, null);
        BinaryTreeNode right = new BinaryTreeNode(2, left, null);
        BinaryTreeNode root = new BinaryTreeNode(1, null, right);
        Assertions.assertEquals(Arrays.asList(1, 3, 2), classObj.inorderTraversal(root));
    }

    @Test
    void test_inorderTraversal_expectEmptyList_whenTreeHasNoNodes() {
        Assertions.assertEquals(Collections.emptyList(), classObj.inorderTraversal(null));
    }

    @Test
    void test_inorderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
        BinaryTreeNode root = new BinaryTreeNode(1, null, null);
        Assertions.assertEquals(List.of(1), classObj.inorderTraversal(root));
    }
}
