package practice.graphs;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

   public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
      Set<String> set = new HashSet<>();
      Collections.addAll(set, wordList);
      Queue<WordPair> queue = new LinkedList<>();
      queue.add(new WordPair(startWord, 1));
      while (!queue.isEmpty()) {
         WordPair wordPair = queue.poll();
         set.remove(wordPair.word);
         if (wordPair.word.equalsIgnoreCase(targetWord)) {
            return wordPair.length;
         }
         addNextWordTransition(wordPair.word, queue, set, wordPair.length);
      }
      return 0;
   }

   private void addNextWordTransition(String word, Queue<WordPair> queue, Set<String> set,
      int currentLength) {
      for (int i = 0; i < word.length(); i++) {
         for (int j = 0; j < 26; j++) {
            String nextWord = word.substring(0, i) + (char) ('a' + j) + word.substring(i + 1);
            if (set.contains(nextWord) && !nextWord.equalsIgnoreCase(word)) {
               queue.add(new WordPair(nextWord, currentLength + 1));
            }
         }
      }
   }

   static class WordPair {

      String word;
      int length;

      public WordPair(String word, int length) {
         this.word = word;
         this.length = length;
      }
   }
}
