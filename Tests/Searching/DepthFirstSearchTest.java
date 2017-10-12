package Searching;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepthFirstSearchTest {
    @Test
    void depthFirstSearchTest() {

        List<Integer> expectedResult = new LinkedList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(3);
        expectedResult.add(6);

        DepthFirstSearch.Node root = new DepthFirstSearch.Node(1);
        DepthFirstSearch.Node second = new DepthFirstSearch.Node(2);
        DepthFirstSearch.Node third = new DepthFirstSearch.Node(3);
        DepthFirstSearch.Node fourth = new DepthFirstSearch.Node(4);
        DepthFirstSearch.Node fifth = new DepthFirstSearch.Node(5);
        DepthFirstSearch.Node sixth = new DepthFirstSearch.Node(6);

        root.left = second;
        root.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;

        List<Integer> actualResult = DepthFirstSearch.depthFirstSearch(root);

        assertEquals(expectedResult, actualResult);
    }

}