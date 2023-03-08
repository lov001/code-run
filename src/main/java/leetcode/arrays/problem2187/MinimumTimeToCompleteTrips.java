package leetcode.arrays.problem2187;

import java.util.Arrays;

public class MinimumTimeToCompleteTrips {

    public long minimumTime(int[] time, int totalTrips) {
        int minTime = Arrays.stream(time).max().getAsInt();
        int maxTime = Arrays.stream(time).sum();

        while (minTime < maxTime) {
            int mid = (minTime + maxTime) / 2;
            int trips = 0;
            for (int iThTime : time) {
                trips += mid / iThTime;
                if (trips >= totalTrips) {
                    break;
                }
            }
            if (trips >= totalTrips) {
                maxTime = mid;
            } else {
                minTime = mid + 1;
            }
        }
        return minTime;
    }
}