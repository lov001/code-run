package practice.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {

   Queue<Integer> queue;
   Map<Integer, Integer> map;
   int size;

   public LRUCache(int capacity) {
      size = capacity;
      map = new HashMap<>();
      queue = new LinkedList<>();
   }

   public int get(int key) {
      if (map.containsKey(key)) {
         queue.remove(key);
         queue.add(key);
         return map.get(key);
      }
      return -1;
   }

   public void put(int key, int value) {
      if (map.containsKey(key)) {
         map.put(key, value);
         queue.remove(key);
         queue.add(key);
      } else {
         if (queue.size() == size) {
            Integer oldestKey = queue.poll();
            map.remove(oldestKey);
         }
         map.put(key, value);
         queue.add(key);
      }
   }
}