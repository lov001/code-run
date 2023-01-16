package leetcode.arrays.problem121;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximiseStockProfitTest {

    MaximiseStockProfit classObj = new MaximiseStockProfit();

    @Test
    void test_maxProfit_expect5_whenOnGivenInputTraderBooksProfit() {
        int[] input = {7, 1, 5, 3, 6, 4};
        Assertions.assertEquals(5, classObj.maxProfit(input));
    }

    @Test
    void test_maxProfit_expect0_whenOnGivenInputTraderCannotBookProfit() {
        int[] input = {7, 6, 4, 3, 1};
        Assertions.assertEquals(0, classObj.maxProfit(input));
    }

    @Test
    void test_maxProfit_expect1_whenInputSizeIs2() {
        int[] input = {1, 2};
        Assertions.assertEquals(1, classObj.maxProfit(input));
    }

    @Test
    void test_maxProfit_expect3_whenInputSizeIs3() {
        int[] input = {1, 4, 2};
        Assertions.assertEquals(3, classObj.maxProfit(input));
    }

    @Test
    void test_maxProfit_expect4_whenInputGiven() {
        int[] input = {3, 3, 5, 0, 0, 3, 1, 4};
        Assertions.assertEquals(4, classObj.maxProfit(input));
    }
}
