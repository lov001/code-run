package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

   public List<List<String>> partition(String s) {
      List<List<String>> output = new ArrayList<>();
      helper(s, 0, new ArrayList<>(), output);
      return output;
   }

   private void helper(String str, int index, List<String> subList, List<List<String>> output) {
      if (index == str.length()) {
         output.add(new ArrayList<>(subList));
         return;
      }
      for (int i = index; i < str.length(); i++) {
         if (isPalindrome(str, index, i)) {
            subList.add(str.substring(index, i + 1));
            helper(str, i + 1, subList, output);
            subList.remove(subList.size() - 1);
         }
      }
   }

   private boolean isPalindrome(String str, int start, int end) {
      while (start <= end) {
         if (str.charAt(start) != str.charAt(end)) {
            return false;
         }
         start++;
         end--;
      }
      return true;
   }
}
