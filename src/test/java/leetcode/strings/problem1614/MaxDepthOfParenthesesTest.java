package leetcode.strings.problem1614;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxDepthOfParenthesesTest {

    MaxDepthOfParentheses classObj = new MaxDepthOfParentheses();

    @Test
    void test_maxDepth_expect3_whenMaxDepthIs3() {
        String input = "(1+(2*3)+((8)/4))+1";
        Assertions.assertEquals(3, classObj.maxDepth(input));
    }

    @Test
    void test_maxDepth_expect3_when() {
        String input = "(1)+((2))+(((3)))";
        Assertions.assertEquals(3, classObj.maxDepth(input));
    }
}
