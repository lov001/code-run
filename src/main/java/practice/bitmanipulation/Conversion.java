package practice.bitmanipulation;

public class Conversion {

   public int bitFlipsRequiredForConversion(int initial, int target) {
      int noOfBitFlips = 0;
      for (int i = 0; i < Integer.BYTES * 8; i++) {
         if ((initial & 1) != (target & 1)) {
            noOfBitFlips++;
         }
         initial >>>= 1;
         target >>>= 1;
      }
      return noOfBitFlips;
   }

   public int bitFlipsRequiredForConversionOptimised(int initial, int target) {
      int noOfBitFlips = 0;
      for (int i = initial ^ target; i != 0; i = i >> 1) {
         noOfBitFlips += i & 1;
      }
      return noOfBitFlips;
   }
}
