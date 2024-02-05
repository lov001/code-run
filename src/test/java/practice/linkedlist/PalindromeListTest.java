package practice.linkedlist;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeListTest {


   PalindromeList classObj = new PalindromeList();

   @Test
   void test_isPalindrome_expectTrue_whenListIsPalindrome() {
      Node head = new Node(1);
      Node val1 = new Node(2);
      Node val2 = new Node(2);
      Node val3 = new Node(1);
      head.next = val1;
      val1.next = val2;
      val2.next = val3;
      assertTrue(classObj.isPalindromeUsingStack(head));
      assertTrue(classObj.isPalindrome(head));
   }

   @Test
   void test_isPalindrome_expectFalse_whenListIsNotPalindrome() {
      Node head = new Node(1);
      head.next = new Node(2);
      assertFalse(classObj.isPalindromeUsingStack(head));
      assertFalse(classObj.isPalindrome(head));
   }

   @Test
   void test_isPalindrome_expectTrue_whenListHasOnlyOneElement() {
      Node head = new Node(1);
      assertTrue(classObj.isPalindrome(head));
      assertTrue(classObj.isPalindromeUsingStack(head));
   }

   @Test
   void test_isPalindrome_expectTrue_whenListHasAllSameElements() {
      Node head = new Node(2);
      head.next = new Node(2);
      assertTrue(classObj.isPalindromeUsingStack(head));
      assertTrue(classObj.isPalindrome(head));
   }

   @Test
   void test_isPalindrome_expectFalse_whenListIsNotAPalindrome() {
      Node head = new Node(1);
      Node val1 = new Node(2);
      Node val2 = new Node(3);
      Node val3 = new Node(4);
      head.next = val1;
      val1.next = val2;
      val2.next = val3;
      assertFalse(classObj.isPalindromeUsingStack(head));
      assertFalse(classObj.isPalindrome(head));
   }

}
