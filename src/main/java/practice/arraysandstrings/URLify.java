package practice.arraysandstrings;

public class URLify {


   public String urlify(char[] str, int length) {
      int end = str.length - 1;
      int strEnd = length - 1;
      char[] whitespace = {'%', '2', '0'};
      char[] char_array = new char[str.length];
      for (int i = end; i >= 0; ) {
         if (str[strEnd] == ' ') {
            for (int j = 2; j >= 0; j--) {
               char_array[i--] = whitespace[j];
            }
            strEnd--;
         } else {
            char_array[i] = str[strEnd];
            strEnd--;
            i--;
         }
      }
      return new String(char_array);
   }

   public void replaceSpaces(char[] char_array, int trueLength) {
      int spaceCount = 0, index, i;
      for (i = 0; i < trueLength; i++) {
         if (char_array[i] == ' ') {
            spaceCount++;
         }
      }
      index = trueLength + spaceCount * 2;
      if (trueLength < char_array.length) {
         char_array[trueLength] = '\0';
      }
      for (i = trueLength - 1; i >= 0; i--) {
         if (char_array[i] == ' ') {
            char_array[index - 1] = '0';
            char_array[index - 2] = '2';
            char_array[index - 3] = '%';
            index -= 3;
         } else {
            char_array[index - 1] = char_array[i];
            index--;
         }
      }
   }

}
