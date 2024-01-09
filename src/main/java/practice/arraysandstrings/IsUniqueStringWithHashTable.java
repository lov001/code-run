package practice.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class IsUniqueStringWithHashTable {


   /**
    * @param str - It will a string input.
    * @return boolean
    */
   public boolean isUniqueString(String str) {
      Map<Character, Integer> char_map = new HashMap<>();
      for (char ch : str.toCharArray()) {
         if (char_map.get(ch) != null) {
            return false;
         }
         char_map.put(ch, char_map.getOrDefault(ch, 0) + 1);
      }
      return true;
   }

}
