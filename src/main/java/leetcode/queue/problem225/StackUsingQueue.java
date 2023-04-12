package leetcode.queue.problem225;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private final Queue<Integer> q1;
    private final Queue<Integer> q2;

    public StackUsingQueue() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        q1.add(x);
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public Integer pop() {
        return q1.poll();
    }

    public Integer top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
