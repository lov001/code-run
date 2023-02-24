package leetcode.strings.problem383;


public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomArray = new int[26];
        int[] magazineArray = new int[26];
        for (char ch : ransomNote.toCharArray()) {
            ransomArray[ch - 'a']++;
        }
        for (char ch : magazine.toCharArray()) {
            magazineArray[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            if (ransomArray[ch - 'a'] != magazineArray[ch - 'a']
                && ransomArray[ch - 'a'] > magazineArray[ch - 'a']) {
                return false;
            }
        }
        return true;
    }
}
