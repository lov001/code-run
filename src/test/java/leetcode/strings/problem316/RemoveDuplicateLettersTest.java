package leetcode.strings.problem316;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateLettersTest {

    RemoveDuplicateLetters classObj = new RemoveDuplicateLetters();

    @Test
    void test_removeDuplicateLetters_expectAbc_whenInputIsBcabc() {
        Assertions.assertEquals("abc", classObj.removeDuplicateLetters("bcabc"));
    }

    @Test
    void test_removeDuplicateLetters_expectAcdb_whenInputIsCbacdcbc() {
        Assertions.assertEquals("acdb", classObj.removeDuplicateLetters("cbacdcbc"));
    }
}
