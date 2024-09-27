package practice.dynamicprogrammingandrecursion;

public class SubsetSumEqualToK {

   public boolean subsetSumToK(int n, int k, int[] arr) {
      return helper(n - 1, k, arr);
   }

   private boolean helper(int index, int k, int[] arr) {
      if (k == 0) {
         return true;
      }
      if (index < 0 || k < 0) {
         return false;
      }
      boolean pick = helper(index - 1, k - arr[index], arr);
      if (pick) {
         return true;
      }

      return helper(index - 1, k, arr);
   }
}
