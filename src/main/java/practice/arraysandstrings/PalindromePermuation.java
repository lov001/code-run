package practice.arraysandstrings;

public class PalindromePermuation {


   public boolean palindrome(String str) {
      int length = str.length();
      int[] map = new int[128];
      str = str.toLowerCase();
      for (int i = 0; i < length; i++) {
         int index = str.charAt(i);
         map[index]++;
      }
      int count = 0;
      for (int i = 0; i < map.length; i++) {
         if (map[i] != 0 && map[i] % 2 != 0 && i != 32) {
            count++;
         }
         if (count > 1) {
            return false;
         }
      }

      return true;
   }

   public boolean isPermutationOfPalindrome2(String str) {
      int countOdd = 0;
      int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
      for (char ch : str.toCharArray()) {
         int x = getCharNumber(ch);
         if (x != -1) {
            table[x]++;
            if (table[x] % 2 == 1) {
               countOdd++;
            } else {
               countOdd--;
            }
         }
      }
      return countOdd <= 1;
   }

   public boolean isPermutationOfPalindrome(String str) {
      int[] table = buildCharFrequencyTable(str);
      return checkMaxOneOdd(table);
   }

   public boolean isPermutationOfPalindrome3(String str){
      int bitVector = createBitVector(str);
      return bitVector == 0 | checkExactlyOneBitSet(bitVector);
   }

   private boolean checkExactlyOneBitSet(int bitVector) {
      return (bitVector & (bitVector - 1)) == 0;
   }

   /* Create a bit vector for the string. For each letter with value i, toggle the ith bit. */
   private int createBitVector(String str) {
      int bitVector = 0;
      for(char ch : str.toCharArray()){
         int x = getCharNumber(ch);
         bitVector = toggle(bitVector, x);
      }
      return bitVector;
   }

   private int toggle(int bitVector, int x) {
      if(x < 0){
         return bitVector;
      }
      int mask = 1 << x;
      if((bitVector & mask) == 0){
         bitVector |= mask;
      } else {
         bitVector &= ~mask;
      }
      return bitVector;
   }

   private boolean checkMaxOneOdd(int[] table) {
      boolean foundOdd = false;
      for (int count : table) {
         if (count % 2 == 1) {
            if (foundOdd) {
               return false;
            }
            foundOdd = true;
         }
      }
      return true;
   }

   private int[] buildCharFrequencyTable(String str) {
      int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
      for (char c : str.toCharArray()) {
         int x = getCharNumber(c);
         if (x != -1) {
            table[x]++;
         }
      }
      return table;
   }

   private int getCharNumber(char c) {
      int a = Character.getNumericValue('a');
      int z = Character.getNumericValue('z');
      int ch = Character.getNumericValue(c);
      if (ch >= a && ch <= z) {
         return ch - a;
      } else {
         return -1;
      }
   }

}
