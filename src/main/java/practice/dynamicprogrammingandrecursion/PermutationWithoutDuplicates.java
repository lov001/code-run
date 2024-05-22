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

   private String insertCharAt(String word, char first, int i) {
      String start = word.substring(0, i);
      String end = word.substring(i);
      return start + first + end;
   }


}
