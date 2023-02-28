package leetcode.strings.problem58;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {

    LengthOfLastWord classObj = new LengthOfLastWord();
    LengthOfLastWordApproach2 classObj2 = new LengthOfLastWordApproach2();

    @Test
    void test_lengthOfLastWord_expect5_whenLastWordIsWorld() {
        String input = "Hello World";
        Assertions.assertEquals(5, classObj.lengthOfLastWord(input));
        Assertions.assertEquals(5, classObj2.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect4_whenLastWordIsMoon() {
        String input = "   fly me   to   the moon  ";
        Assertions.assertEquals(4, classObj.lengthOfLastWord(input));
        Assertions.assertEquals(4, classObj2.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect6_whenLastWordIsJoyboy() {
        String input = "luffy is still joyboy";
        Assertions.assertEquals(6, classObj.lengthOfLastWord(input));
        Assertions.assertEquals(6, classObj2.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect1_whenLastWordIsA() {
        String input = "a";
        Assertions.assertEquals(1, classObj.lengthOfLastWord(input));
        Assertions.assertEquals(1, classObj2.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect3_whenLastWordIsDay() {
        String input = "day";
        Assertions.assertEquals(3, classObj.lengthOfLastWord(input));
        Assertions.assertEquals(3, classObj2.lengthOfLastWord(input));
    }

    @Test
    void test_lengthOfLastWord_expect1_whenLastWordIsA_() {
        String input = "a ";
        Assertions.assertEquals(1, classObj.lengthOfLastWord(input));
        Assertions.assertEquals(1, classObj2.lengthOfLastWord(input));
    }
}
