package leetcode.searching.binarysearch.problem69;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootTest {

    SquareRoot classObj = new SquareRoot();

    @Test
    void test_mySqrt_expect2_whenNumberIs4() {
        Assertions.assertEquals(2, classObj.mySqrt(4));
    }

    @Test
    void test_mySqrt_expect2_whenNumberIs8() {
        Assertions.assertEquals(2, classObj.mySqrt(8));
    }
}
