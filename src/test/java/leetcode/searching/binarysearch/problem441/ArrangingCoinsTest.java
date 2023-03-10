package leetcode.searching.binarysearch.problem441;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrangingCoinsTest {

    ArrangingCoins classObj = new ArrangingCoins();

    @Test
    void test_arrangeCoins_expect2_whenInputIs5() {
        Assertions.assertEquals(2, classObj.arrangeCoins(5));
    }

    @Test
    void test_arrangeCoins_expect3_whenInputIs8() {
        Assertions.assertEquals(3, classObj.arrangeCoins(8));
    }
}
