package practice.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringWithConcatenationOfAllWords {

   public List<Integer> findSubstring(String s, String[] words) {
      List<Integer> ans = new ArrayList<>();
      if (s == null || s.length() == 0 || words == null || words.length == 0) {
         return ans;
      }
      Map<String, Integer> wordMap = new HashMap<>();
      for (String word : words) {
         wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
      }
      int wordLength = words[0].length();
      int totalWordsLength = wordLength * words.length;
      for (int i = 0; i <= s.length() - totalWordsLength; i++) {
         Map<String, Integer> copyMap = new HashMap<>(wordMap);
         for (int j = 0; j < words.length; j++) {
            String subString = s.substring(i + j * wordLength, i + j * wordLength + wordLength);
            if (copyMap.containsKey(subString)) {
               int count = copyMap.get(subString);
               if (count == 1) {
                  copyMap.remove(subString);
               } else {
                  copyMap.put(subString, count - 1);
               }
               if (copyMap.isEmpty()) {
                  ans.add(i);
                  break;
               }
            } else {
               break;
            }
         }
      }
      return ans;
   }
}
