package practice.arraysandstrings;

public class StringCompression {


   public String compress(String str) {
      StringBuilder output = new StringBuilder();
      output.append(str.charAt(0));
      int characterCount = 1;
      for (int i = 1; i < str.length(); i++) {
         if (str.charAt(i) == str.charAt(i - 1)) {
            characterCount++;
         } else {
            output.append(characterCount);
            output.append(str.charAt(i));
            characterCount = 1;
         }
      }
      output.append(characterCount);
      return output.length() >= str.length() ? str : output.toString();
   }

   public String optimalCompression(String str) {
      int finalLength = calculateFinalCompressedLength(str);
      if (finalLength >= str.length()) {
         return str;
      }
      StringBuilder compressedString = new StringBuilder(finalLength);
      int characterCount = 0;
      for (int i = 0; i < str.length(); i++) {
         characterCount++;
         if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
            compressedString.append(str.charAt(i));
            compressedString.append(characterCount);
            characterCount = 0;
         }
      }
      return compressedString.toString();
   }

   private int calculateFinalCompressedLength(String str) {
      int compressedLength = 0;
      int countConsecutive = 0;
      for (int i = 0; i < str.length(); i++) {
         countConsecutive++;
         if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
            compressedLength += 1 + String.valueOf(countConsecutive).length();
            countConsecutive = 0;
         }
      }
      return compressedLength;
   }
}
