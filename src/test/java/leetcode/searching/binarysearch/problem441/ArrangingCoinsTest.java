package leetcode.searching.binarysearch.problem441;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrangingCoinsTest {

    ArrangingCoins classObj = new ArrangingCoins();
    ArrangingCoinsApproach2 classObj2 = new ArrangingCoinsApproach2();

    @Test
    void test_arrangeCoins_expect2_whenInputIs5() {
        Assertions.assertEquals(2, classObj.arrangeCoins(5));
        Assertions.assertEquals(2, classObj2.arrangeCoins(5));
    }

    @Test
    void test_arrangeCoins_expect3_whenInputIs8() {
        Assertions.assertEquals(3, classObj.arrangeCoins(8));
        Assertions.assertEquals(3, classObj2.arrangeCoins(8));
    }

    @Test
    void test_arrangeCoins_expect60070_whenInputIs1804289383() {
        Assertions.assertEquals(60070, classObj.arrangeCoins(1804289383));
        Assertions.assertEquals(60070, classObj2.arrangeCoins(1804289383));
    }
}
