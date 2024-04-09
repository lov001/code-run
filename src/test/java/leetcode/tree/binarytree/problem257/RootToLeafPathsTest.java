package leetcode.tree.binarytree.problem257;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RootToLeafPathsTest {

    RootToLeafPaths classObj = new RootToLeafPaths();
    RootToLeafPathsApproach2UsingDFS classObj2 = new RootToLeafPathsApproach2UsingDFS();
    RootToLeafPathsIterativeApproachUsingStack classObj3 =
        new RootToLeafPathsIterativeApproachUsingStack();

    @Test
    void test_binaryTreePaths_expectTwoPaths_whenGivenTree() {
        BinaryTreeNode right2 = new BinaryTreeNode(5, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, right2);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);
        List<String> output = new ArrayList<>();
        output.add("1->2->5");
        output.add("1->3");
        Assertions.assertEquals(output, classObj.binaryTreePaths(tree));
        Assertions.assertEquals(output, classObj2.binaryTreePaths(tree));
        Assertions.assertEquals(output, classObj3.binaryTreePaths(tree));
    }

    @Test
    void test_binaryTreePaths_expectOnlyRoot_whenGivenTreeContainsOnlyRoot() {
        BinaryTreeNode tree = new BinaryTreeNode(1, null, null);
        Assertions.assertEquals(Collections.singletonList("1"), classObj.binaryTreePaths(tree));
        Assertions.assertEquals(Collections.singletonList("1"), classObj2.binaryTreePaths(tree));
        Assertions.assertEquals(Collections.singletonList("1"), classObj3.binaryTreePaths(tree));
    }

    @Test
    void test_binaryTreePaths_expectTwoPaths_whenGivenTreeHas3Nodes() {
        BinaryTreeNode right1 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, null, null);
        BinaryTreeNode tree = new BinaryTreeNode(1, left1, right1);
        List<String> output = new ArrayList<>();
        output.add("1->2");
        output.add("1->3");
        Assertions.assertEquals(output, classObj.binaryTreePaths(tree));
        Assertions.assertEquals(output, classObj2.binaryTreePaths(tree));
        Assertions.assertEquals(output, classObj3.binaryTreePaths(tree));
    }
}
