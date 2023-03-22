package leetcode.tree.binarysearchtree.problem589;

import static org.junit.jupiter.api.Assertions.assertEquals;

import domain.Node;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TreePreOrderTraversalTest {

    TreePreOrderTraversal classObj = new TreePreOrderTraversal();

    @Test
    void test_preorder_expectOutput_whenGivenInput() {
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node2 = new Node(2);
        Node node3 = new Node(3, Arrays.asList(node5, node6));
        Node node4 = new Node(4);
        Node node1 = new Node(1, Arrays.asList(node3, node2, node4));
        List<Integer> output = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 2, 4));
        assertEquals(output, classObj.preorder(node1));
    }

    @Test
    void test_preorder_expectOutput_whenGivenInput2() {
        Node node14 = new Node(14);
        Node node13 = new Node(13);
        Node node12 = new Node(12);
        Node node11 = new Node(11, Collections.singletonList(node14));
        Node node10 = new Node(10);
        Node node9 = new Node(9, Collections.singletonList(node13));
        Node node8 = new Node(8, Collections.singletonList(node12));
        Node node7 = new Node(7, Collections.singletonList(node11));
        Node node6 = new Node(6);
        Node node5 = new Node(5, Arrays.asList(node9, node10));
        Node node4 = new Node(4, Collections.singletonList(node8));
        Node node3 = new Node(3, Arrays.asList(node6, node7));
        Node node2 = new Node(2);
        Node node1 = new Node(1, Arrays.asList(node2, node3, node4, node5));
        List<Integer> output = new ArrayList<>(
            Arrays.asList(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10));
        assertEquals(output, classObj.preorder(node1));
    }
}
