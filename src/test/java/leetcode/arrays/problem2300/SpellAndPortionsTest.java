package leetcode.arrays.problem2300;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpellAndPortionsTest {

    SpellAndPortions classObj = new SpellAndPortions();

    @Test
    void test_successfulPairs_expect403_whenSuccessIs7() {
        int[] spell = {5, 1, 3};
        int[] portion = {1, 2, 3, 4, 5};
        int[] result = {4, 0, 3};
        Assertions.assertEquals(Arrays.toString(result),
            Arrays.toString(classObj.successfulPairs(spell, portion, 7)));
    }

    @Test
    void test_successfulPairs_expect202_whenSuccessIs16() {
        int[] spell = {3, 1, 2};
        int[] portion = {8, 5, 8};
        int[] result = {2, 0, 2};
        Assertions.assertEquals(Arrays.toString(result),
            Arrays.toString(classObj.successfulPairs(spell, portion, 16)));

    }
}
