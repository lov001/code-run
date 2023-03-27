package leetcode.tree.binarytree.problem144;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PreOrderTraversalTest {

    PreOrderTraversal classObj = new PreOrderTraversal();

    @Test
    void test_preorderTraversal_expectOrderedList_whenTreeHasNodes() {
        TreeNode left = new TreeNode(3, null, null);
        TreeNode right = new TreeNode(2, left, null);
        TreeNode root = new TreeNode(1, null, right);
        Assertions.assertEquals(Arrays.asList(1, 2, 3), classObj.preorderTraversal(root));
    }

    @Test
    void test_preorderTraversal_expectEmptyList_whenTreeHasNoNodes() {
        Assertions.assertEquals(Collections.emptyList(), classObj.preorderTraversal(null));
    }

    @Test
    void test_preorderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
        TreeNode root = new TreeNode(1, null, null);
        Assertions.assertEquals(List.of(1), classObj.preorderTraversal(root));
    }
}
