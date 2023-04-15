package leetcode.queue.problem933;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecentCounterUsingBinarySearch {

    List<Integer> requests;

    public RecentCounterUsingBinarySearch() {
        this.requests = new ArrayList<>();
    }

    public int ping(int t) {
        requests.add(t);
        int index = Collections.binarySearch(requests, t - 3000);
        if (index < 0) {
            index = ~index;
        } // if t - 3000 is not in list, use the index of the ceiling of t - 3000.
        return requests.size() - index;
    }
}
