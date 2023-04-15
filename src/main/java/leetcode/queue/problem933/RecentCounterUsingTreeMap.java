package leetcode.queue.problem933;

import java.util.TreeMap;

public class RecentCounterUsingTreeMap {

    TreeMap<Integer, Integer> requests;

    public RecentCounterUsingTreeMap() {
        this.requests = new TreeMap<>();
    }

    public int ping(int t) {
        requests.put(t, 1 + requests.size());
        return requests.tailMap(t - 3000).size();
    }
}
