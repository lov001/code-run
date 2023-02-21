package leetcode.strings.problem1790;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleSwapTest {

    SingleSwap classObj = new SingleSwap();

    @Test
    void test_areAlmostEqual_expectTrue_whenBankAndKanb() {
        String input = "bank";
        String swapStr = "kanb";
        Assertions.assertTrue(classObj.areAlmostEqual(input, swapStr));
    }

    @Test
    void test_areAlmostEqual_expectFalse_whenNotEqual() {
        String input = "attack";
        String swapStr = "defend";
        Assertions.assertFalse(classObj.areAlmostEqual(input, swapStr));
    }

    @Test
    void test_areAlmostEqual_expectTrue_whenBothStringsExactlySame() {
        String input = "kelb";
        String swapStr = "kelb";
        Assertions.assertTrue(classObj.areAlmostEqual(input, swapStr));
    }

    @Test
    void test_areAlmostEqual_expectFalse_whenAbcdAndDcba() {
        String input = "abcd";
        String swapStr = "dcba";
        Assertions.assertFalse(classObj.areAlmostEqual(input, swapStr));
    }

    @Test
    void test_areAlmostEqual_expectFalse_whenLongStrings() {
        String input = "cwywcvxpxcwxngreogncptlsxicwbjudtkuezcpvwcunxhqteiuooytvgycldbpwevqguqpqtxuxhyzshr";
        String swapStr = "hduwpirvtlnycycpwjbtrsdwwqctwxoohxuuuohupcezzxvtqgwcpgcxuvxexxeevsbkpgitcqcynqglny";
        Assertions.assertFalse(classObj.areAlmostEqual(input, swapStr));
    }

    @Test
    void test_areAlmostEqual_expectFalse_whenCaaAndAaz() {
        String input = "caa";
        String swapStr = "aaz";
        Assertions.assertFalse(classObj.areAlmostEqual(input, swapStr));
    }
}
