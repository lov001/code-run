package practice.binarysearch;

public class MaxDistanceBetweenGasStations {

   public double minimiseMaxDistance(int[] arr, int K) {
      int n = arr.length - 1;
      int[] howMany = new int[n];
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
}
