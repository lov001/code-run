package leetcode.tree.binarytree.problem257;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RootToLeafPathsTest {

    RootToLeafPaths classObj = new RootToLeafPaths();
    RootToLeafPathsApproach2UsingDFS classObj2 = new RootToLeafPathsApproach2UsingDFS();
    RootToLeafPathsIterativeApproachUsingStack classObj3 =
        new RootToLeafPathsIterativeApproachUsingStack();

    @Test
    void test_binaryTreePaths_expectTwoPaths_whenGivenTree() {
        TreeNode right2 = new TreeNode(5, null, null);
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(2, null, right2);
        TreeNode tree = new TreeNode(1, left1, right1);
        List<String> output = new ArrayList<>();
        output.add("1->2->5");
        output.add("1->3");
        Assertions.assertEquals(output, classObj.binaryTreePaths(tree));
        Assertions.assertEquals(output, classObj2.binaryTreePaths(tree));
        Assertions.assertEquals(output, classObj3.binaryTreePaths(tree));
    }

    @Test
    void test_binaryTreePaths_expectOnlyRoot_whenGivenTreeContainsOnlyRoot() {
        TreeNode tree = new TreeNode(1, null, null);
        Assertions.assertEquals(Collections.singletonList("1"), classObj.binaryTreePaths(tree));
        Assertions.assertEquals(Collections.singletonList("1"), classObj2.binaryTreePaths(tree));
        Assertions.assertEquals(Collections.singletonList("1"), classObj3.binaryTreePaths(tree));
    }

    @Test
    void test_binaryTreePaths_expectTwoPaths_whenGivenTreeHas3Nodes() {
        TreeNode right1 = new TreeNode(3, null, null);
        TreeNode left1 = new TreeNode(2, null, null);
        TreeNode tree = new TreeNode(1, left1, right1);
        List<String> output = new ArrayList<>();
        output.add("1->2");
        output.add("1->3");
        Assertions.assertEquals(output, classObj.binaryTreePaths(tree));
        Assertions.assertEquals(output, classObj2.binaryTreePaths(tree));
        Assertions.assertEquals(output, classObj3.binaryTreePaths(tree));
    }
}
