package leetcode.problem589;

import static org.junit.jupiter.api.Assertions.assertEquals;

import domain.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Ignore;

public class TreePreOrderTraversalTest {

    TreePreOrderTraversal classObj = new TreePreOrderTraversal();

    @Ignore
    void test_preorder_expectOutput_whenGivenInput() {
        Node node5 = new Node(3);
        Node node6 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(3, Arrays.asList(node5, node6));
        Node node4 = new Node(3);
        Node node1 = new Node(1, Arrays.asList(node3, node2, node4));
        List<Integer> output = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 2, 4));
        assertEquals(output, classObj.preorder(node1));
    }
}
