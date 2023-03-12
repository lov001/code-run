package leetcode.searching.binarysearch.problem374;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestNumberHigherOrLowerTest {

    GreatestNumberHigherOrLower classObj = new GreatestNumberHigherOrLower();

    @Test
    void test_guessNumber_expect6_whenPickedNumberIs6() {
        Assertions.assertEquals(6, classObj.guessNumber(10));
    }

    @Test
    void test_guessNumber_expect1_whenPickedNumberIs1AndNis1() {
        Assertions.assertEquals(1, classObj.guessNumber(1));
    }

    @Test
    void test_guessNumber_expect1_whenPickedNumberIs1() {
        Assertions.assertEquals(1, classObj.guessNumber(2));
    }
}
