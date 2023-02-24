package leetcode.strings.problem383;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {

    RansomNote classObj = new RansomNote();

    @Test
    void test_canConstruct_expectFalse_whenInputIsAAndB() {
        String ransomNote = "a";
        String magazine = "b";
        Assertions.assertFalse(classObj.canConstruct(ransomNote, magazine));
    }

    @Test
    void test_canConstruct_expectFalse_whenInputIsAaAndAb() {
        String ransomNote = "aa";
        String magazine = "ab";
        Assertions.assertFalse(classObj.canConstruct(ransomNote, magazine));
    }

    @Test
    void test_canConstruct_expectTrue_whenInputIsAaAndAab() {
        String ransomNote = "aa";
        String magazine = "aab";
        Assertions.assertTrue(classObj.canConstruct(ransomNote, magazine));
    }

    @Test
    void test_canConstruct_expectTrue_whenInputIsAabAndBaa() {
        String ransomNote = "aab";
        String magazine = "baa";
        Assertions.assertTrue(classObj.canConstruct(ransomNote, magazine));
    }

    @Test
    void test_canConstruct_expectTrue_whenInputIsRandomString() {
        String ransomNote = "bg";
        String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        Assertions.assertTrue(classObj.canConstruct(ransomNote, magazine));
    }
}
