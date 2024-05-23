package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithoutDuplicates {

   public List<String> getPermutations(String str) {
      if (str == null) {
         return null;
      }
      List<String> permutations = new ArrayList<>();
      if (str.length() == 0) {
         permutations.add("");
         return permutations;
      }
      char first = str.charAt(0);
      String remainder = str.substring(1);
      List<String> words = getPermutations(remainder);
      for (String word : words) {
         for (int i = 0; i <= word.length(); i++) {
            String result = insertCharAt(word, first, i);
            permutations.add(result);
         }
      }
      return permutations;
   }

   public List<String> getPermutationsFromNMinusOne(String remainder) {
      int length = remainder.length();
      List<String> result = new ArrayList<>();
      if (length == 0) {
         result.add("");
         return result;
      }
      for (int i = 0; i < length; i++) {
         String before = remainder.substring(0, i);
         String after = remainder.substring(i + 1, length);

         List<String> partials = getPermutationsFromNMinusOne(before + after);
         for (String str : partials) {
            result.add(remainder.charAt(i) + str);
         }
      }
      return result;
   }

   private String insertCharAt(String word, char first, int i) {
      String start = word.substring(0, i);
      String end = word.substring(i);
      return start + first + end;
   }


}
