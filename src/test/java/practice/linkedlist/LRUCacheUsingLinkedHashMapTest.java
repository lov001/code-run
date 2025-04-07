package practice.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LRUCacheUsingLinkedHashMapTest {

   @Test
   void test_LRUCacheUsingLinkedHashMap_expectResult_whenAsserted(){
      LRUCacheUsingLinkedHashMap cache = new LRUCacheUsingLinkedHashMap(2);
      cache.put(1, 1);
      cache.put(2, 2);
      Assertions.assertEquals(1, cache.get(1));
      cache.put(3, 3);                    // evicts key 2
      Assertions.assertEquals(-1, cache.get(2));   // returns -1 (not found)
      cache.put(4, 4);                    // evicts key 1
      Assertions.assertEquals(-1, cache.get(1));   // returns -1 (not found)
      Assertions.assertEquals(3, cache.get(3));   // returns 3
      Assertions.assertEquals(4, cache.get(4));
   }
}
