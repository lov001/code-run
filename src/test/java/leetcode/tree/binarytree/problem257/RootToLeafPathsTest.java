package leetcode.tree.binarytree.problem257;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RootToLeafPathsTest {

    RootToLeafPaths classObj = new RootToLeafPaths();

    @Test
    void test_binaryTreePaths_expectTwoPaths_whenGivenTree() {
        TreeNode right2 = new TreeNode(5, null, null);
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(2, null, right2);
        TreeNode tree = new TreeNode(1, left1, right1);
        List<String> output = new ArrayList<>();
        output.addAll(Arrays.asList("1", "2", "5"));
        output.addAll(Arrays.asList("1", "3"));
        Assertions.assertEquals(output, classObj.binaryTreePaths(tree));
    }

    @Test
    void test_binaryTreePaths_expectOnlyRoot_whenGivenTreeContainsOnlyRoot() {
        TreeNode tree = new TreeNode(1, null, null);
        Assertions.assertEquals(Collections.singletonList("1"), classObj.binaryTreePaths(tree));
    }
}
