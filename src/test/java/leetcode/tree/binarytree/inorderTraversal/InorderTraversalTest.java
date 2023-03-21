package leetcode.tree.binarytree.inorderTraversal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InorderTraversalTest {

    InorderTraversal classObj = new InorderTraversal();

    @Test
    void test_inorderTraversal_expectOrderedList_whenTreeHasNodes() {
        TreeNode left = new TreeNode(3, null, null);
        TreeNode right = new TreeNode(2, left, null);
        TreeNode root = new TreeNode(1, null, right);
        Assertions.assertEquals(Arrays.asList(1, 3, 2), classObj.printList(root));
    }

    @Test
    void test_inorderTraversal_expectEmptyList_whenTreeHasNoNodes() {
        Assertions.assertEquals(Collections.emptyList(), classObj.printList(null));
    }

    @Test
    void test_inorderTraversal_expectOnlyRootNode_whenTreeHasOnlyRootNode() {
        TreeNode root = new TreeNode(1, null, null);
        Assertions.assertEquals(List.of(1), classObj.printList(root));
    }
}
