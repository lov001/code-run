package leetcode.queue.problem387;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharacterTest {

    FirstUniqueCharacter classObj = new FirstUniqueCharacter();
    FirstUniqueCharacterApproach2 classObj2 = new FirstUniqueCharacterApproach2();

    @Test
    void test_firstUniqueChar_expect0_whenNonRepeatingCharacterIs1st() {
        Assertions.assertEquals(0, classObj.firstUniqueChar("leetcode"));
        Assertions.assertEquals(0, classObj2.firstUniqueChar("leetcode"));
    }

    @Test
    void test_firstUniqueChar_expect2_whenNonRepeatingCharacterIs2nd() {
        Assertions.assertEquals(2, classObj.firstUniqueChar("loveleetcode"));
        Assertions.assertEquals(2, classObj2.firstUniqueChar("loveleetcode"));
    }

    @Test
    void test_firstUniqueChar_expectMinus1_whenNonRepeatingCharacterDoesNotExist() {
        Assertions.assertEquals(-1, classObj.firstUniqueChar("aabb"));
        Assertions.assertEquals(-1, classObj2.firstUniqueChar("aabb"));
    }
}
