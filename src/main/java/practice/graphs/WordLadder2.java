package practice.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder2 {

   public ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord,
      String[] wordList) {
      Set<String> set = new HashSet<>();
      Collections.addAll(set, wordList);
      ArrayList<ArrayList<String>> result = new ArrayList<>();
      Queue<ArrayList<String>> queue = new LinkedList<>();
      ArrayList<String> list = new ArrayList<>();
      list.add(startWord);
      queue.add(list);
      int level = 0;
      ArrayList<String> usedOnLevel = new ArrayList<>();
      usedOnLevel.add(startWord);
      while (!queue.isEmpty()) {
         ArrayList<String> wordLists = queue.poll();
         if (wordLists.size() > level) {
            level++;
            for (String word : usedOnLevel) {
               set.remove(word);
            }
         }
         String lastWord = wordLists.get(wordLists.size() - 1);
         if (lastWord.equalsIgnoreCase(targetWord)) {
            if (result.size() == 0) {
               result.add(wordLists);
            } else if (result.get(0).size() == wordLists.size()) {
               result.add(wordLists);
            }
         }
         addNextWordTransitionToList(lastWord, queue, set, wordLists, usedOnLevel);
      }
      return result;
   }

   private void addNextWordTransitionToList(String word, Queue<ArrayList<String>> queue,
      Set<String> set, ArrayList<String> wordLists, ArrayList<String> usedOnLevel) {
      for (int i = 0; i < word.length(); i++) {
         for (int j = 0; j < 26; j++) {
            String nextWord = word.substring(0, i) + (char) ('a' + j) + word.substring(i + 1);
            if (set.contains(nextWord)) {
               wordLists.add(nextWord);
               ArrayList<String> words = new ArrayList<>(wordLists);
               queue.add(words);
               usedOnLevel.add(nextWord);
               wordLists.remove(wordLists.size() - 1);
            }
         }
      }
   }
}
