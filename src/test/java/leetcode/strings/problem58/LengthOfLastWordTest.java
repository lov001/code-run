package leetcode.strings.problem58;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {

    LengthOfLastWord classObj = new LengthOfLastWord();

    @Test
    void test_lengthOfLastWord_expect5_whenLastWordIsWorld() {
        String input = "Hello World";
        Assertions.assertEquals(5, classObj.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect4_whenLastWordIsMoon() {
        String input = "   fly me   to   the moon  ";
        Assertions.assertEquals(4, classObj.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect6_whenLastWordIsJoyboy() {
        String input = "luffy is still joyboy";
        Assertions.assertEquals(6, classObj.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect1_whenLastWordIsA() {
        String input = "a";
        Assertions.assertEquals(1, classObj.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect3_whenLastWordIsDay() {
        String input = "day";
        Assertions.assertEquals(3, classObj.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect1_whenLastWordIsA_() {
        String input = "a ";
        Assertions.assertEquals(1, classObj.lengthOfLastWord(input));
    }
}
