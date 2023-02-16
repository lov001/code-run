package leetcode.arrays.problem989;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayFormOfIntegerTest {

    ArrayFormOfInteger classObj = new ArrayFormOfInteger();

    @Test
    void test_addToArrayForm_expect1234_whenKIs34() {
        int[] input = {1, 2, 0, 0};
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4), classObj.addToArrayForm(input, 34));
    }

    @Test
    void test_addToArrayForm_expect455_whenKIs181() {
        int[] input = {2, 7, 4};
        Assertions.assertEquals(Arrays.asList(4, 5, 5), classObj.addToArrayForm(input, 181));
    }

    @Test
    void test_addToArrayForm_expect1021_whenKIs806() {
        int[] input = {2, 1, 5};
        Assertions.assertEquals(Arrays.asList(1, 0, 2, 1), classObj.addToArrayForm(input, 806));
    }

    @Test
    void test_addToArrayForm_expect1AndAll9_whenInputIsAll9() {
        int[] input = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        Assertions.assertEquals(Arrays.asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
            classObj.addToArrayForm(input, 1));
    }

    @Test
    void test_addToArrayForm_expect_whenArraysContains0AndKIs23() {
        int[] input = {0};
        Assertions.assertEquals(Arrays.asList(2,3), classObj.addToArrayForm(input, 23));
    }

    @Test
    void test_addToArrayForm_expect_whenArraysContains0AndKIs1000() {
        int[] input = {0};
        Assertions.assertEquals(Arrays.asList(1,0,0,0), classObj.addToArrayForm(input, 1000));
    }
}
