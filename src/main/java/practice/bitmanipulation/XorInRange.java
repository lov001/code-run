package practice.bitmanipulation;

public class XorInRange {

   public int calculateXOR(int n) {
      if (n % 4 == 1) {
         return 1;
      } else if (n % 4 == 2) {
         return n + 1;
      } else if (n % 4 == 3) {
         return 0;
      } else {
         return n;
      }
   }

   public int calculateXORWithinRange(int l, int r) {
      return calculateXOR(l - 1) ^ calculateXOR(r);
   }
}
