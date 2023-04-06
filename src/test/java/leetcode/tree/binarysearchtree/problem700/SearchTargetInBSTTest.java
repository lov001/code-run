package leetcode.tree.binarysearchtree.problem700;

import leetcode.tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTargetInBSTTest {

    SearchTargetInBST classObj = new SearchTargetInBST();

    @Test
    void test_searchBST_expect213_whenGivenTargetIs2() {
        TreeNode right2 = new TreeNode(3, null, null);
        TreeNode left2 = new TreeNode(1, null, null);
        TreeNode right1 = new TreeNode(7, null, null);
        TreeNode left1 = new TreeNode(2, left2, right2);
        TreeNode tree = new TreeNode(4, left1, right1);

        TreeNode output = classObj.searchBST(tree, 2);
        Assertions.assertEquals(left1.val, output.val);
        Assertions.assertEquals(left1.left.val, output.left.val);
        Assertions.assertEquals(left1.right.val, output.right.val);
    }

    @Test
    void test_searchBST_expectNull_whenGivenTargetIs5() {
        TreeNode right2 = new TreeNode(3, null, null);
        TreeNode left2 = new TreeNode(1, null, null);
        TreeNode right1 = new TreeNode(7, null, null);
        TreeNode left1 = new TreeNode(2, left2, right2);
        TreeNode tree = new TreeNode(4, left1, right1);

        TreeNode output = classObj.searchBST(tree, 2);
        Assertions.assertNull(output);
    }
}
