package leetcode.arrays.problem995;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsecutiveBitFlipsTest {

    ConsecutiveBitFlips classObj = new ConsecutiveBitFlips();

    @Test
    void test_minKBitFlips_expect2_whenKIs1() {
        int[] input = {0, 1, 0};
        Assertions.assertEquals(2, classObj.minKBitFlips(input, 1));
    }

    @Test
    void test_minKBitFlips_expectMinus1_whenKIs2() {
        int[] input = {1,1,0};
        Assertions.assertEquals(-1, classObj.minKBitFlips(input, 2));
    }

    @Test
    void test_minKBitFlips_expect3_whenKIs3() {
        int[] input = {0,0,0,1,0,1,1,0};
        Assertions.assertEquals(3, classObj.minKBitFlips(input, 3));
    }
}
