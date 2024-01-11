package practice.arraysandstrings;

public class PalindromePermuation {


   public boolean palindrome(String str) {
      int length = str.length();
      int[] map = new int[128];
      str = str.toLowerCase();
      for (int i = 0; i < length; i++) {
         int index = str.charAt(i);
         map[index]++;
      }
      int count = 0;
      for (int i = 0; i < map.length; i++) {
         if (map[i] != 0 && map[i] % 2 != 0 && i != 32) {
            count++;
         }
         if (count > 1) {
            return false;
         }
      }

      return true;
   }

}
