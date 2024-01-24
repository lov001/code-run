package practice.arraysandstrings;

public class OneEditAway {


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

}
