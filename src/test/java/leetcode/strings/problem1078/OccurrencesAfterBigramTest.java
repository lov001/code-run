package leetcode.strings.problem1078;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OccurrencesAfterBigramTest {

    OccurrencesAfterBigram classObj = new OccurrencesAfterBigram();

    @Test
    void test_findOccurrences_expectArrayOfLength2_when2Occurrences() {
        String input = "alice is a good girl she is a good student";
        String first = "a";
        String two = "good";
        String[] output = {"girl", "student"};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.findOccurrences(input, first, two)));
    }

    @Test
    void test_findOccurrences_expectArrayOfLength2_when2() {
        String input = "we will we will rock you";
        String first = "we";
        String two = "will";
        String[] output = {"we", "rock"};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.findOccurrences(input, first, two)));
    }
}
