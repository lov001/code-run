package leetcode.queue.problem232;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueUsingStackTest {

    @Test
    void test_QueueUsingStack() {
        QueueUsingStack myQueue = new QueueUsingStack();
        myQueue.push(1);
        myQueue.push(2);
        Assertions.assertEquals(1, myQueue.peek());
        Assertions.assertEquals(1, myQueue.pop());
        Assertions.assertFalse(myQueue.empty());
    }

    @Test
    void test_QueueUsingStack_() {
        QueueUsingStackApproach2 myQueue = new QueueUsingStackApproach2();
        myQueue.push(1);
        myQueue.push(2);
        Assertions.assertEquals(1, myQueue.peek());
        Assertions.assertEquals(1, myQueue.pop());
        Assertions.assertFalse(myQueue.empty());
    }
}
