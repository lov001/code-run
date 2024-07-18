package practice.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

   public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
      int count = Integer.MAX_VALUE;
      boolean isFound = false;
      Set<String> set = new HashSet<>();
      for (String word : wordList) {
         set.add(word);
      }
      Queue<WordPair> queue = new LinkedList<>();
      queue.add(new WordPair(startWord, 1));
      while (!queue.isEmpty()) {
         WordPair wordPair = queue.poll();
         set.remove(wordPair.word);
         if (wordPair.word.equalsIgnoreCase(targetWord)) {
            count = Math.min(count, wordPair.length);
            isFound = true;
         }
         addNextWordTransition(wordPair.word, queue, set, wordPair.length);
      }
      return isFound ? count : 0;
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
