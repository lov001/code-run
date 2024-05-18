package practice.bitmanipulation;

import java.util.ArrayList;
import java.util.List;
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
      if (currentOnes > maxConsecutiveOnes) {
         return currentOnes;
      }
      return maxConsecutiveOnes + 1;
   }

   public int flipBit(int number) {
      if (~number == 0) {
         return Integer.BYTES * 8;
      }
      int currentLength = 0;
      int previousLength = 0;
      int maxLength = 1;

      while (number != 0) {
         if ((number & 1) == 1) {
            currentLength++;
         } else if ((number & 1) == 0) {
            previousLength = (number & 2) == 0 ? 0 : currentLength;
            currentLength = 0;
         }
         maxLength = Math.max(previousLength + currentLength + 1, maxLength);
         number >>>= 1;
      }
      return maxLength;
   }


   public int longestSequence(int number) {
      if (number == -1) {
         return Integer.BYTES * 8;
      }
      List<Integer> sequences = getSequences(number);
      return findLongestSequence(sequences);
   }

   private List<Integer> getSequences(int number) {
      List<Integer> sequences = new ArrayList<>();
      int searchingFor = 0;
      int counter = 0;
      for (int i = 0; i < Integer.BYTES * 8; i++) {
         if ((number & 1) != searchingFor) {
            sequences.add(counter);
            searchingFor = number & 1;
            counter = 0;
         }
         counter++;
         number = number >>> 1;
      }
      return sequences;
   }

   private int findLongestSequence(List<Integer> sequences) {
      int maxSeq = 1;
      for (int i = 0; i < sequences.size(); i += 2) {
         int zeroSeq = sequences.get(i);
         int onesSeqRight = i - 1 >= 0 ? sequences.get(i - 1) : 0;
         int onesSeqLeft = i + 1 < sequences.size() ? sequences.get(i + 1) : 0;

         int thisSeq = 0;

         if (zeroSeq == 1) {
            thisSeq = onesSeqLeft + 1 + onesSeqRight;
         } else if (zeroSeq > 1) {
            thisSeq = 1 + Math.max(onesSeqLeft, onesSeqRight);
         } else if (zeroSeq == 0) {
            thisSeq = Math.max(onesSeqLeft, onesSeqRight);
         }

         maxSeq = Math.max(maxSeq, thisSeq);
      }
      return maxSeq;
   }
}