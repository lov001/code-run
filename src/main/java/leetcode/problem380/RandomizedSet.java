package leetcode.problem380;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {


   Set<Integer> randomizedSet;

   public RandomizedSet() {
      this.randomizedSet = new HashSet<>();
   }

   public boolean insert(int val) {
      if (randomizedSet.contains(val)) {
         return false;
      }
      randomizedSet.add(val);
      return true;
   }

   public boolean remove(int val) {
      if (randomizedSet.contains(val)) {
         randomizedSet.remove(val);
         return true;
      }
      return false;
   }

   public int getRandom() {
      Integer[] arrayNumbers = randomizedSet.toArray(new Integer[randomizedSet.size()]);

      Random random = new Random();
      int randomNumber = random.nextInt(randomizedSet.size());

      return arrayNumbers[randomNumber];
   }

   public Set<Integer> getAllValues() {
      return randomizedSet;
   }
}
