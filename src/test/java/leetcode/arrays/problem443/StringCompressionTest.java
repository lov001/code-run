package leetcode.arrays.problem443;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    StringCompression classObj = new StringCompression();

    @Test
    void test_compress_expect6_whenLengthIs6() {
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        Assertions.assertEquals(6, classObj.compress(input));
    }

    @Test
    void test_compress_expect1_whenLengthIs1() {
        char[] input = {'a'};
        Assertions.assertEquals(1, classObj.compress(input));
    }

    @Test
    void test_compress_expect4_whenLengthIs4() {
        char[] input = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        Assertions.assertEquals(4, classObj.compress(input));
    }

    @Test
    void test_compress_expect10_whenLengthIs10() {
        char[] input = {'b','0','l','A',']','+','O','5','j','4'};
        Assertions.assertEquals(10, classObj.compress(input));
    }
}
