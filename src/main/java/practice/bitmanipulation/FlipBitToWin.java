package practice.bitmanipulation;

import practice.utils.NumberConversionUtil;

public class FlipBitToWin {

   public int maxOnes(int number) {
      String binaryRepresentation = NumberConversionUtil.convertDecimalToBinary(number);
      if ("".equals(binaryRepresentation)) {
         return 0;
      }
      int maxConsecutiveOnes = 0;
      int currentOnes = 1;
      for (int i = 1; i < binaryRepresentation.length(); i++) {
         if (binaryRepresentation.charAt(i - 1) == '1' && binaryRepresentation.charAt(i) == '1') {
            currentOnes++;
         } else {
            if ((i + 1) < binaryRepresentation.length()
               && binaryRepresentation.charAt(i + 1) == '1') {
               int j = i + 1;
               while (j < binaryRepresentation.length() && binaryRepresentation.charAt(j) == '1') {
                  currentOnes++;
                  j++;
               }
            }
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentOnes);
            currentOnes = 1;
         }
      }
      return maxConsecutiveOnes + 1;
   }
}