package practice.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheUsingDoublyLinkedList {

   private final int capacity;
   private final Map<Integer, Node> cache;
   private final Node head;
   private final Node tail;

   public LRUCacheUsingDoublyLinkedList(int capacity) {
      this.capacity = capacity;
      this.cache = new HashMap<>();
      head = new Node(0, 0);
      tail = new Node(0, 0);
      head.next = tail;
      tail.prev = head;
   }

   public int get(int key) {
      if (!cache.containsKey(key)) {
         return -1;
      }
      Node node = cache.get(key);
      remove(node);
      insertAtHead(node);
      return node.value;
   }

   public void put(int key, int value) {
      if (cache.containsKey(key)) {
         Node node = cache.get(key);
         node.value = value;
         remove(node);
         insertAtHead(node);
      } else {
         if (cache.size() == capacity) {
            Node lastRecentlyUsed = tail.prev;
            remove(lastRecentlyUsed);
            cache.remove(lastRecentlyUsed.key);
         }
         Node node = new Node(key, value);
         cache.put(key, node);
         insertAtHead(node);
      }
   }

   private void insertAtHead(Node node) {
      node.next = head.next;
      node.prev = head;
      head.next.prev = node;
      head.next = node;
   }

   private void remove(Node node) {
      node.prev.next = node.next;
      node.next.prev = node.prev;
   }

   static class Node {

      int key;
      int value;
      Node prev;
      Node next;

      public Node(int key, int value) {
         this.key = key;
         this.value = value;
      }
   }

}
