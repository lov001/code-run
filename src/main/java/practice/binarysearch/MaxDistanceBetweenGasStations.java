package practice.binarysearch;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.PriorityQueue;

public class MaxDistanceBetweenGasStations {

   public double minimiseMaxDistance(int[] arr, int K) {
      int n = arr.length;
      int[] howMany = new int[n - 1];
      for (int gasStations = 1; gasStations <= K; gasStations++) {
         double maxSection = -1;
         int maxIndex = -1;
         for (int i = 0; i < n - 1; i++) {
            double difference = arr[i + 1] - arr[i];
            double sectionLength = difference / (double) (howMany[i] + 1);
            if (sectionLength > maxSection) {
               maxSection = sectionLength;
               maxIndex = i;
            }
         }
         howMany[maxIndex]++;
      }
      double maxAns = -1;
      for (int i = 0; i < n - 1; i++) {
         double difference = arr[i + 1] - arr[i];
         double sectionLength = difference / (double) (howMany[i] + 1);
         maxAns = Math.max(maxAns, sectionLength);
      }
      return maxAns;
   }

   public double minimiseMaxDistanceBinarySearch(int[] arr, int K) {
      int n = arr.length;
      double low = 0;
      double high = 0;
      for (int i = 0; i < n - 1; i++) {
         high = Math.max(high, arr[i + 1] - arr[i]);
      }
      double difference = 1e-6;
      while (high - low > difference) {
         double mid = (low + high) / 2.0;
         int count = numberOfGasStations(mid, arr);
         if (count > K) {
            low = mid;
         } else {
            high = mid;
         }
      }
      DecimalFormat df = new DecimalFormat("#.#");
      df.setRoundingMode(RoundingMode.FLOOR);
      return Double.parseDouble(df.format(high));
   }

   private int numberOfGasStations(double distance, int[] array) {
      int count = 0;
      for (int i = 1; i < array.length; i++) {
         double numberBetween = (array[i] - array[i - 1]) / distance;
         if (array[i] - array[i - 1] / distance == numberBetween * distance) {
            numberBetween--;
         }
         count += numberBetween;
      }
      return count;
   }

   public double minimiseMaxDistanceUsingPriorityQueue(int[] arr, int K) {
      int n = arr.length;
      int[] howMany = new int[n - 1];
      PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(
         (a, b) -> Double.compare(b.first, a.first));
      for (int i = 0; i < n - 1; i++) {
         priorityQueue.offer(new Pair(arr[i + 1] - arr[i], i));
      }
      for (int gasStations = 1; gasStations <= K; gasStations++) {
         Pair pair = priorityQueue.poll();
         int sectionIndex = pair.second;
         howMany[sectionIndex]++;
         double difference = arr[sectionIndex + 1] - arr[sectionIndex];
         double sectionLength = difference / (double) (howMany[sectionIndex] + 1);
         priorityQueue.offer(new Pair(sectionLength, sectionIndex));
      }
      return priorityQueue.peek().first;
   }

   private static class Pair {

      double first;
      int second;

      public Pair(double first, int second) {
         this.first = first;
         this.second = second;
      }
   }
}
