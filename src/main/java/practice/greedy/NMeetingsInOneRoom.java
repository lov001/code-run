package practice.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NMeetingsInOneRoom {

   public int maxMeetings(int n, int[] start, int[] end) {
      int maxMeetings = 0;
      List<Meeting> meetings = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         meetings.add(new Meeting(start[i], end[i], i + 1));
      }
      Collections.sort(meetings);
      int lastMeetingEndedOn = 0;
      for (Meeting meeting : meetings) {
         if (meeting.start > lastMeetingEndedOn) {
            maxMeetings++;
            lastMeetingEndedOn = meeting.end;
         }
      }

      return maxMeetings;
   }

   public static class Meeting implements Comparable<Meeting> {

      int start;
      int end;
      int position;

      public Meeting(int start, int end, int pos) {
         this.start = start;
         this.end = end;
         this.position = pos;
      }

      @Override
      public int compareTo(Meeting otherMeeting) {
         if (this.end < otherMeeting.end) {
            return -1;
         } else if (this.end > otherMeeting.end) {
            return 1;
         } else if (this.position < otherMeeting.position) {
            return -1;
         }
         return 1;
      }
   }
}
