package practice.arraysandstrings;

import java.util.Arrays;

public class CheckStringPermutation {


   public static final int MAX_CHARS_LIMIT = 128;

   public boolean checkPermutation(String str1, String str2) {
      if (str1.length() != str2.length()) {
         return false;
      }
      int[] char_map = new int[MAX_CHARS_LIMIT];
      for (char ch : str1.toCharArray()) {
         char_map[ch] = char_map[ch] + 1;
      }
      for (char ch : str2.toCharArray()) {
         char_map[ch] = char_map[ch] - 1;
         if (char_map[ch] < 0) {
            return false;
         }
      }
      return true;
   }


   public boolean checkPermutation2(String str1, String str2) {
      if (str1.length() != str2.length()) {
         return false;
      }
      return sort(str1).equals(sort(str2));
   }

   private String sort(String str){
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);
      return new String(charArray);
   }
}
