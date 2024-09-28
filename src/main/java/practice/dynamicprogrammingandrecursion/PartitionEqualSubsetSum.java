package practice.dynamicprogrammingandrecursion;

public class PartitionEqualSubsetSum {

   public boolean canPartition(int[] arr, int n) {
      int totalSum = 0;
      for (int i = 0; i < n; i++) {
         totalSum += arr[i];
      }
      if (totalSum % 2 != 0) {
         return false;
      }
      SubsetSumEqualToK subsetSum = new SubsetSumEqualToK();
      return subsetSum.subsetSumToKUsingTabulation(n, totalSum / 2, arr);
   }
}
