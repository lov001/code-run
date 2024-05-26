package practice.dynamicprogrammingandrecursion;

public class Coins {

   public int makeChange(int n) {
      int[] denominations = {25, 10, 5, 1};
      return makeChange(n, denominations, 0);
   }

   private int makeChange(int amount, int[] denominations, int index) {
      if (index >= denominations.length - 1) {
         return 1;
      }
      int denominationAmount = denominations[index];
      int noOfWays = 0;
      for (int i = 0; i * denominationAmount <= amount; i++) {
         int remainingAmount = amount - denominationAmount * i;
         noOfWays += makeChange(remainingAmount, denominations, index + 1);
      }
      return noOfWays;
   }

   public int makeChangeOptimised(int n) {
      int[] denominations = {25, 10, 5, 1};
      int[][] memo = new int[n + 1][denominations.length];
      return makeChange(n, denominations, 0, memo);
   }

   private int makeChange(int amount, int[] denominations, int index, int[][] memo) {
      if (memo[amount][index] > 0) {
         return memo[amount][index];
      }
      if (index >= denominations.length - 1) {
         return 1;
      }
      int denominationAmount = denominations[index];
      int noOfWays = 0;
      for (int i = 0; i * denominationAmount <= amount; i++) {
         int remainingAmount = amount - denominationAmount * i;
         noOfWays += makeChange(remainingAmount, denominations, index + 1, memo);
      }
      memo[amount][index] = noOfWays;
      return noOfWays;
   }
}
