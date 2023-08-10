package leetcode.problem380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSetUsingMapAndArrayList {


   List<Integer> list;
   Map<Integer, Integer> map;
   Random rand;

   public RandomizedSetUsingMapAndArrayList() {
      this.list = new ArrayList<>();
      this.map = new HashMap<>();
      this.rand = new Random();
   }

   public boolean insert(int val) {
      if (map.containsKey(val)) {
         return false;
      }
      map.put(val, list.size());
      list.add(val);
      return true;
   }

   public boolean remove(int val) {
      if (!map.containsKey(val)) {
         return false;
      }
      int indexToRemove = map.get(val);
      int lastElement = list.get(list.size() - 1);
      list.set(indexToRemove, lastElement);
      map.put(lastElement, indexToRemove);

      list.remove(list.size() - 1);
      map.remove(val);
      return true;
   }

   public int getRandom() {
      int randomNumber = rand.nextInt(list.size());
      return list.get(randomNumber);
   }

   public List<Integer> getAllValues() {
      return list;
   }
}
