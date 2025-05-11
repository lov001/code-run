package practice.linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {

   private final int size;
   private final Node head;
   private final Node tail;
   private final Map<Integer, Node> cache;
   private final Map<Integer, Integer> map;

   Queue<Integer> queue;

   public LRUCache(int capacity, int initialValue) {
      this.size = capacity;
      this.cache = new HashMap<>();
      this.map = new HashMap<>();
      head = new Node(0, 0);
      tail = new Node(0, 0);
      head.next = tail;
      tail.prev = head;
      initialValue = 1;
   }

   public LRUCache(int capacity) {
      size = capacity;
      cache = new HashMap<>();
      map = new HashMap<>();
      queue = new LinkedList<>();
      head = new Node(0, 0);
      tail = new Node(0, 0);
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

   public int getFromDL(int key) {
      if (cache.containsKey(key)) {
         Node node = cache.get(key);
         removeNode(node);
         insertAtHead(node);
         return node.value;
      }
      return -1;
   }

   public void putFromDL(int key, int value) {
      if (cache.containsKey(key)) {
         Node node = cache.get(key);
         node.value = value;
         cache.put(key, node);
         removeNode(node);
         insertAtHead(node);
      } else {
         if (cache.size() == size) {
            Node lastRecentlyUsedNode = tail.prev;
            removeNode(lastRecentlyUsedNode);
            cache.remove(lastRecentlyUsedNode.key);
         }
         Node node = new Node(key, value);
         cache.put(key, node);
         insertAtHead(node);
      }
   }

   private void removeNode(Node node) {
      node.prev.next = node.next;
      node.next.prev = node.prev;
   }

   private void insertAtHead(Node node) {
      node.next = head.next;
      node.prev = head;
      node.next.prev = node;
      head.next = node;
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