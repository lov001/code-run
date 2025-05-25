package leetcode.strings.problem242;

public class ValidAnagram {

    /*
        Approach 1: If two strings are anagrams, sorting them will give identical strings.

        Approach 2: Count frequency of each character in both strings using a map. Compare both maps.

     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charArray[s.charAt(i) - 'a']++;
            charArray[t.charAt(i) - 'a']--;
        }
        for (int c : charArray) {
            if (c != 0) return false;
        }
//        for (char ch : s.toCharArray()) {
//            charArray[ch - 'a']++;
//        }
//        for (char ch : t.toCharArray()) {
//            charArray[ch - 'a']--;
//        }
//        for (int ch : charArray) {
//            if (ch > 0) {
//                return false;
//            }
//        }
        return true;
    }
}
