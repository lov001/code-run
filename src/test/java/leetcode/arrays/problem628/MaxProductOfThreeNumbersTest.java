package leetcode.arrays.problem628;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxProductOfThreeNumbersTest {

    MaxProductOfThreeNumbers classObj = new MaxProductOfThreeNumbers();

    @Test
    void test_maximumProduct_expect6_whenOnly3NumbersInInput() {
        int[] input = {1, 2, 3};
        Assertions.assertEquals(6, classObj.maximumProduct(input));
    }

    @Test
    void test_maximumProduct_expect24_whenOnly4NumbersInInput() {
        int[] input = {1, 2, 3, 4};
        Assertions.assertEquals(24, classObj.maximumProduct(input));
    }

    @Test
    void test_maximumProduct_expectMinus6_whenOnly3NegativeNumbersInInput() {
        int[] input = {-1, -2, -3};
        Assertions.assertEquals(-6, classObj.maximumProduct(input));
    }
}
