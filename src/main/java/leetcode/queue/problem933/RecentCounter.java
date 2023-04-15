package leetcode.queue.problem933;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {

    List<Integer> requests;

    public RecentCounter() {
        this.requests = new ArrayList<>();
    }

    public int ping(int t) {
        requests.add(t);
        return getRecentRequestsCount();
    }

    private int getRecentRequestsCount() {
        int count = 0;
        int start = requests.get(requests.size() - 1) - 3000;
        int end = requests.get(requests.size() - 1);

        for (int i = requests.size() - 1; i >= 0; i--) {
            int currentRequest = requests.get(i);
            if (currentRequest >= start && currentRequest <= end) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
