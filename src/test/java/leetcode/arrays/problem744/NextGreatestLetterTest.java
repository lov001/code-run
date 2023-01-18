package leetcode.arrays.problem744;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextGreatestLetterTest {

    NextGreatestLetter classObj = new NextGreatestLetter();

    @Test
    void test_nextGreatestLetter_expectC_whenGivenInput() {
        char[] input = {'c', 'f', 'j' };
        Assertions.assertEquals('c', classObj.nextGreatestLetter(input, 'a'));
    }

    @Test
    void test_nextGreatestLetter_expectF_whenGivenInput() {
        char[] input = {'c', 'f', 'j' };
        Assertions.assertEquals('f', classObj.nextGreatestLetter(input, 'c'));
    }

    @Test
    void test_nextGreatestLetter_expectFirstCharacter_whenInputDoesNotHaveGreaterThanTarget() {
        char[] input = {'x', 'x', 'y', 'y' };
        Assertions.assertEquals('x', classObj.nextGreatestLetter(input, 'z'));
    }
}
