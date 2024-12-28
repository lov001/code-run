package practice.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

   public int[] twoSum(int[] arr, int n, int target) {
      int[] output = {-1, -1};
      Map<Integer, Integer> map = new HashMap<>();
      int smallestFirstIndex = Integer.MAX_VALUE;
      int smallestSecondIndex = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
         int difference = target - arr[i];
         if (map.containsKey(difference)) {
            int firstIndex = map.get(difference);
            int secondIndex = i;
            if (firstIndex < smallestFirstIndex ||
               (firstIndex == smallestFirstIndex && secondIndex < smallestSecondIndex)) {
               output[0] = firstIndex;
               output[1] = secondIndex;
               smallestFirstIndex = firstIndex;
               smallestSecondIndex = secondIndex;
            }
         }
         map.putIfAbsent(arr[i], i);
      }
      return output;
   }

   public int[] twoSumTwoPointers(int[] arr, int n, int target) {
      int[] output = {-1, -1};
      List<Pair> pairs = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         pairs.add(new Pair(arr[i], i));
      }
      pairs.sort(Comparator.comparing(a -> a.number));
      int j = n - 1;
      int i = 0;
      int smallestFirstIndex = Integer.MAX_VALUE;
      int smallestSecondIndex = Integer.MAX_VALUE;
      while (i < j) {
         if (pairs.get(i).number + pairs.get(j).number == target) {
            int secondIndex = j;
            if (i < smallestFirstIndex ||
               (i == smallestFirstIndex && secondIndex < smallestSecondIndex)) {
               output[0] = i;
               output[1] = secondIndex;
               smallestFirstIndex = i;
               smallestSecondIndex = secondIndex;
            }
            j--;
         } else if (pairs.get(i).number + pairs.get(j).number > target) {
            j--;
         } else {
            i++;
         }
      }
      return output;
   }

   static public class Pair {

      int number;
      int index;

      public Pair(int number, int index) {
         this.number = number;
         this.index = index;
      }
   }
}
