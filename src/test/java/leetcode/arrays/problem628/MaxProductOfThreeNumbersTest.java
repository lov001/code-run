package leetcode.arrays.problem628;

import leetcode.arrays.problem628.MaxProductOfThreeNumbers;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxProductOfThreeNumbersTest {

    MaxProductOfThreeNumbers classObj = new MaxProductOfThreeNumbers();

    @Ignore
    void test_maximumProduct_expect6_whenOnly3NumbersInInput() {
        int[] input = {1, 2, 3};
        Assertions.assertEquals(6, classObj.maximumProduct(input));
    }

    @Ignore
    void test_maximumProduct_expect24_whenOnly4NumbersInInput() {
        int[] input = {1, 2, 3, 4};
        Assertions.assertEquals(24, classObj.maximumProduct(input));
    }

    @Ignore
    void test_maximumProduct_expectMinus6_whenOnly3NegativeNumbersInInput() {
        int[] input = {-1, -2, -3};
        Assertions.assertEquals(-6, classObj.maximumProduct(input));
    }
}
