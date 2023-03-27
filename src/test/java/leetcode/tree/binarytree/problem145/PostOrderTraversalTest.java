package leetcode.tree.binarytree.problem145;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostOrderTraversalTest {

    PostOrderTraversal classObj = new PostOrderTraversal();
    PostOrderTraversalUsingIterativeApproach classObj2 =
        new PostOrderTraversalUsingIterativeApproach();

    @Test
    void test_preorderTraversal_expectOrderedList_whenTreeHasNodes() {
        TreeNode left = new TreeNode(3, null, null);
        TreeNode right = new TreeNode(2, left, null);
        TreeNode root = new TreeNode(1, null, right);
        Assertions.assertEquals(Arrays.asList(3, 2, 1), classObj.postorderTraversal(root));
        Assertions.assertEquals(Arrays.asList(3, 2, 1), classObj2.postorderTraversal(root));
    }

    @Test
    void test_preorderTraversal_expectEmptyList_whenTreeHasNoNodes() {
        Assertions.assertEquals(Collections.emptyList(), classObj.postorderTraversal(null));
        Assertions.assertEquals(Collections.emptyList(), classObj2.postorderTraversal(null));
    }

    @Test
    void test_preorderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
        TreeNode root = new TreeNode(1, null, null);
        Assertions.assertEquals(List.of(1), classObj.postorderTraversal(root));
        Assertions.assertEquals(List.of(1), classObj2.postorderTraversal(root));
    }

    @Test
    void test_preorderTraversal_expectOrderedList_whenTreeHas4Nodes() {
        TreeNode leftLeft = new TreeNode(2, null, null);
        TreeNode left = new TreeNode(4, leftLeft, null);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(1, left, right);
        Assertions.assertEquals(Arrays.asList(2, 4, 3, 1), classObj.postorderTraversal(root));
        Assertions.assertEquals(Arrays.asList(2, 4, 3, 1), classObj2.postorderTraversal(root));
    }
}
