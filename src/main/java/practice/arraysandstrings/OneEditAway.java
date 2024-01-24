package practice.arraysandstrings;

public class OneEditAway {


   public boolean oneEditAway2(String first, String second) {
      if (Math.abs(first.length() - second.length()) > 1) {
         return false;
      }
      String s1 = first.length() < second.length() ? first : second;
      String s2 = first.length() < second.length() ? second : first;

      int index1 = 0, index2 = 0;
      boolean foundDifference = false;

      while (index2 < s2.length() && index1 < s1.length()) {
         if (s1.charAt(index1) != s2.charAt(index2)) {
            if (foundDifference) {
               return false;
            }
            foundDifference = true;
            if (s1.length() == s2.length()) {
               index1++;
            }
         } else {
            index1++;
         }
         index2++;
      }
      return true;
   }

   public boolean isOneEditAway(String str1, String str2) {
      if (Math.abs(str1.length() - str2.length()) > 1) {
         return false;
      }
      int count = 0;
      for (int i = 0, j = 0; i < str1.length() && j < str2.length(); ) {
         if (str1.charAt(i) != str2.charAt(j)) {
            if (str1.length() < str2.length()) {
               count++;
               j++;
            } else if (str1.length() == str2.length()) {
               count++;
               i++;
               j++;
            } else {
               i++;
               count++;
            }
         } else {
            i++;
            j++;
         }
      }
      return count <= 1;
   }

   public boolean oneEditAway(String first, String second) {
      if (first.length() == second.length()) {
         return oneEditReplace(first, second);
      } else if (first.length() + 1 == second.length()) {
         return oneEditInsert(first, second);
      } else if (first.length() - 1 == second.length()) {
         return oneEditInsert(second, first);
      }
      return false;
   }

   private boolean oneEditInsert(String first, String second) {
      int index1 = 0, index2 = 0;
      while (index2 < second.length() && index1 < first.length()) {
         if (first.charAt(index1) != second.charAt(index2)) {
            if (index1 != index2) {
               return false;
            }
            index2++;
         } else {
            index1++;
            index2++;
         }
      }
      return true;
   }

   private boolean oneEditReplace(String first, String second) {
      boolean foundDifference = false;
      for (int i = 0; i < first.length(); i++) {
         if (first.charAt(i) != second.charAt(i)) {
            if (foundDifference) {
               return false;
            }
            foundDifference = true;
         }
      }
      return true;
   }

}
