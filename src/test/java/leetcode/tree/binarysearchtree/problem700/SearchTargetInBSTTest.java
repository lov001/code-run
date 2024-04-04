package leetcode.tree.binarysearchtree.problem700;

import leetcode.tree.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTargetInBSTTest {

    SearchTargetInBST classObj = new SearchTargetInBST();

    @Test
    void test_searchBST_expect213_whenGivenTargetIs2() {
        BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
        BinaryTreeNode tree = new BinaryTreeNode(4, left1, right1);

        BinaryTreeNode output = classObj.searchBST(tree, 2);
        Assertions.assertEquals(left1.val, output.val);
        Assertions.assertEquals(left1.left.val, output.left.val);
        Assertions.assertEquals(left1.right.val, output.right.val);
    }

    @Test
    void test_searchBST_expectNull_whenGivenTargetIs5() {
        BinaryTreeNode right2 = new BinaryTreeNode(3, null, null);
        BinaryTreeNode left2 = new BinaryTreeNode(1, null, null);
        BinaryTreeNode right1 = new BinaryTreeNode(7, null, null);
        BinaryTreeNode left1 = new BinaryTreeNode(2, left2, right2);
        BinaryTreeNode tree = new BinaryTreeNode(4, left1, right1);

        BinaryTreeNode output = classObj.searchBST(tree, 5);
        Assertions.assertNull(output);
    }
}
