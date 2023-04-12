package leetcode.queue.problem225;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackUsingQueueTest {

    @Test
    void test_MyStackUsingQueue() {
        StackUsingQueue myStack = new StackUsingQueue();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.top()); // return 2
        Assertions.assertEquals(2, myStack.pop()); // return 2
        Assertions.assertFalse(myStack.empty()); // return False
    }
}
