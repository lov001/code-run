package practice.greedy;

import java.util.Arrays;

public class FractionalKnapsack {

   public double maximumValue(Pair[] items, int n, int w) {
      double maxValue = 0;
      Arrays.sort(items, (a, b) -> {
         double thisRatio = (double) a.value / a.weight;
         double otherRatio = (double) b.value / b.weight;

         return Double.compare(otherRatio, thisRatio);
      });
      for (int i = 0; i < n; i++) {
         if (w > 0) {
            if (items[i].weight <= w) {
               maxValue += items[i].value;
               w -= items[i].weight;
            } else {
               maxValue += ((double) items[i].value / items[i].weight) * w;
               break;
            }
         } else {
            break;
         }
      }
      return maxValue;
   }

   static class Pair {

      int weight;
      int value;

      Pair(int value, int weight) {
         this.weight = weight;
         this.value = value;
      }
   }
}
