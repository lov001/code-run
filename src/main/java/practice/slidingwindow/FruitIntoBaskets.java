package practice.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FruitIntoBaskets {

   public int findMaxFruits(int[] arr, int n) {
      int maxFruits = 0;
      Map<Integer, Integer> fruitMap = new HashMap<>();
      int l = 0;
      int r = 0;
      while (r < n) {
         fruitMap.put(arr[r], fruitMap.getOrDefault(arr[r], 0) + 1);
         if (fruitMap.size() <= 2) {
            int totalFruits = 0;
            for (Entry<Integer, Integer> entry : fruitMap.entrySet()) {
               totalFruits += entry.getValue();
            }
            maxFruits = Math.max(maxFruits, totalFruits);
         } else {
            while (fruitMap.size() > 2) {
               fruitMap.put(arr[l], fruitMap.get(arr[l]) - 1);
               int noOfFruits = fruitMap.get(arr[l]);
               if (noOfFruits == 0) {
                  fruitMap.remove(arr[l]);
               }
               l++;
            }
         }
         r++;
      }
      return maxFruits;
   }

   public int findMaxFruitsBruteForce(int[] arr, int n) {
      int maxFruits = 0;
      Set<Integer> fruitSet = new HashSet<>();
      for (int i = 0; i < n; i++) {
         int fruitsCollected = 0;
         for (int j = i; j < n; j++) {
            fruitSet.add(arr[j]);
            if (fruitSet.size() <= 2) {
               fruitsCollected++;
               maxFruits = Math.max(maxFruits, fruitsCollected);
            } else {
               fruitSet.clear();
               break;
            }
         }
      }
      return maxFruits;
   }
}
