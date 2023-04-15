package leetcode.queue.problem933;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounterUsingQueue {

    Queue<Integer> requests;

    public RecentCounterUsingQueue() {
        this.requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.offer(t);
        while (requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }
}
