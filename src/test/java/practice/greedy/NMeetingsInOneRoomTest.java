package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NMeetingsInOneRoomTest {

   NMeetingsInOneRoom classObj = new NMeetingsInOneRoom();

   @Test
   void test_maxMeetings_expect4_whenNIs6() {
      int[] start = {1, 3, 0, 5, 8, 5};
      int[] end = {2, 4, 6, 7, 9, 9};
      Assertions.assertEquals(4, classObj.maxMeetings(6, start, end));
      Assertions.assertEquals(4, classObj.maxMeetings(start, end));
   }

   @Test
   void test_maxMeetings_expect1_whenNIs3() {
      int[] start = {10, 12, 20};
      int[] end = {20, 25, 30};
      Assertions.assertEquals(1, classObj.maxMeetings(3, start, end));
      Assertions.assertEquals(1, classObj.maxMeetings(start, end));
   }

   @Test
   void test_maxMeeting_expect4_whenNIs6() {
      int[] start = {0, 3, 1, 5, 5, 8};
      int[] end = {5, 4, 2, 7, 9, 9};
      Assertions.assertEquals(4, classObj.maxMeetings(6, start, end));
      Assertions.assertEquals(4, classObj.maxMeetings(start, end));
   }
}
