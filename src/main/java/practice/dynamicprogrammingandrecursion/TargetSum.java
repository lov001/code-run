package practice.dynamicprogrammingandrecursion;

public class TargetSum {

   public int targetSum(int n, int target, int[] arr) {
      PartitionWithGivenDifference obj = new PartitionWithGivenDifference();
      return obj.countPartitions(n, target, arr);
   }
}
