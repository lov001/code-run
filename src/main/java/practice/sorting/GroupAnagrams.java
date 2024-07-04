package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

   public void groupAnagrams(String[] anagrams) {
      Arrays.sort(anagrams, new AnagramComparator());
   }

   public void groupAnagramOptimised(String[] anagrams) {
      Map<String, List<String>> mapList = new HashMap<>();
      for (String str : anagrams) {
         String key = sortChars(str);
         if (mapList.get(key) == null) {
            List<String> strList = new ArrayList<>();
            strList.add(str);
            mapList.put(key, strList);
         } else {
            List<String> strList = mapList.get(key);
            strList.add(str);
         }
      }
      int index = 0;
      for (String key : mapList.keySet()) {
         List<String> strings = mapList.get(key);
         for (String string : strings) {
            anagrams[index] = string;
            index++;
         }
      }
   }

   static class AnagramComparator implements Comparator<String> {

      @Override
      public int compare(String o1, String o2) {
         return sortChars(o1).compareTo(sortChars(o2));
      }
   }

   private static String sortChars(String str) {
      char[] content = str.toCharArray();
      Arrays.sort(content);
      return new String(content);
   }
}
