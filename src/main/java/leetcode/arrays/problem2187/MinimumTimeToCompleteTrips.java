package leetcode.arrays.problem2187;

import java.util.Arrays;

public class MinimumTimeToCompleteTrips {

    public long minimumTime(int[] time, int totalTrips) {
        long[] minimumTime = new long[time.length];
        for (int i = 0; i < time.length; i++) {
            minimumTime[i] = findIthTime(time[i], time[time.length - 1], totalTrips);
        }
        return Arrays.stream(minimumTime).max().getAsLong();
    }

    private long findIthTime(long time, long maxTime, int totalTrips) {
        long iThTime = maxTime / time;
        while (iThTime > totalTrips) {
            iThTime -= time;
        }
        return iThTime;
    }
}
