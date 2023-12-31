package practice.arraysandstrings;

public class CustomStringBuilder {


   byte[] characters;
   int count;
   private static final byte[] EMPTY_VALUE = new byte[0];


   public CustomStringBuilder() {
      this.characters = EMPTY_VALUE;
   }

   public CustomStringBuilder(int capacity) {
      this.characters = new byte[capacity];
   }

   public CustomStringBuilder(String str) {
      int strLength = str.length();
      int capacity = strLength + 16;
      this.characters = new byte[capacity];
      append(str);
   }

   /**
    * Returns the length (character count). Returns: the length of the sequence of characters
    * currently represented by this object
    */
   public int length() {
      return this.count;
   }

   /**
    * Returns the current capacity. The capacity is the number of characters that can be stored
    * (including already written characters), beyond which an allocation will occur. Returns: the
    * current capacity
    */
   public int capacity() {
      return this.characters.length;
   }

   public CustomStringBuilder append(String str) {
      return null;
   }

   public void delete(int start, int end) {

   }

   public int indexOf(String str) {
      return 0;
   }

   public int indexOf(String str, int start) {
      return 0;
   }

   public CustomStringBuilder insert(int offset, String str) {
      return null;
   }

   public void reverse() {

   }
}
