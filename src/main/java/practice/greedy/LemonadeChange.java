package practice.greedy;

public class LemonadeChange {

   public boolean lemonadeChange(int[] bill) {
      int five = 0;
      int ten = 0;
      for (int customerBill : bill) {
         if (customerBill == 5) {
            five++;
         } else if (customerBill == 10) {
            if (five > 0) {
               five--;
               ten++;
            } else {
               return false;
            }
         } else {
            if (ten > 0 && five > 0) {
               five--;
               ten--;
            } else if (five >= 3) {
               five -= 3;
            } else {
               return false;
            }
         }
      }
      return true;
   }
}
