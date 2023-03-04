package leetcode.strings.problem821;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestDistanceToCharacterTest {

    ShortestDistanceToCharacter classObj = new ShortestDistanceToCharacter();
    ShortestDistanceToCharacterApproach2 classObj2 = new ShortestDistanceToCharacterApproach2();

    @Test
    void test_shortestToChar_expect_whenLetterIsE() {
        String input = "loveleetcode";
        int[] output = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.shortestToChar(input, 'e')));
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj2.shortestToChar(input, 'e')));
    }

    @Test
    void test_shortestToChar_expect_whenLetterIsB() {
        String input = "aaab";
        int[] output = {3, 2, 1, 0};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.shortestToChar(input, 'b')));
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj2.shortestToChar(input, 'b')));
    }
}
