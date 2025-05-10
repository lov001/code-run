package practice.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LRUCacheUsingLinkedHashMapTest {

   @Test
   void test_LRUCacheUsingLinkedHashMap_expectResult_whenAsserted() {
      LRUCacheUsingLinkedHashMap cache = new LRUCacheUsingLinkedHashMap(2);
      cache.put(1, 1);
      cache.put(2, 2);
      Assertions.assertEquals(1, cache.get(1));
      cache.put(3, 3);
      Assertions.assertEquals(-1, cache.get(2));
      cache.put(4, 4);
      Assertions.assertEquals(-1, cache.get(1));
      Assertions.assertEquals(3, cache.get(3));
      Assertions.assertEquals(4, cache.get(4));
   }

   @Test
   void test_LRUCacheUsingDoublyLinkedList_expectResult_whenAsserted() {
      LRUCacheUsingDoublyLinkedList cache = new LRUCacheUsingDoublyLinkedList(2);

      cache.put(1, 1);
      cache.put(2, 2);
      Assertions.assertEquals(1, cache.get(1));
      cache.put(3, 3);
      Assertions.assertEquals(-1, cache.get(2));
      cache.put(4, 4);
      Assertions.assertEquals(-1, cache.get(1));
      Assertions.assertEquals(3, cache.get(3));
      Assertions.assertEquals(4, cache.get(4));
   }

   @Test
   void test_LRUCacheUsingLinkedListAndMap_expectResult_whenAsserted() {
      LRUCache cache = new LRUCache(3);
      cache.put(1, 1);
      cache.put(2, 2);
      cache.put(3, 3);
      cache.put(4, 5);
      Assertions.assertEquals(3, cache.get(3));
      Assertions.assertEquals(-1, cache.get(1));
      Assertions.assertEquals(5, cache.get(4));
      cache.put(2, 3);
      Assertions.assertEquals(-1, cache.get(1));
      Assertions.assertEquals(3, cache.get(3));
      Assertions.assertEquals(3, cache.get(2));
   }

   @Test
   void test_LRUCacheUsingDL_expectResult_whenAsserted() {
      LRUCache cache = new LRUCache(3, 0);
      cache.putFromDL(1, 1);
      cache.putFromDL(2, 2);
      cache.putFromDL(3, 3);
      cache.putFromDL(4, 5);
      Assertions.assertEquals(3, cache.getFromDL(3));
      Assertions.assertEquals(-1, cache.getFromDL(1));
      Assertions.assertEquals(5, cache.getFromDL(4));
      cache.putFromDL(2, 3);
      Assertions.assertEquals(-1, cache.getFromDL(1));
      Assertions.assertEquals(3, cache.getFromDL(3));
      Assertions.assertEquals(3, cache.getFromDL(2));
   }
}
