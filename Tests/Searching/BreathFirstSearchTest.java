package Searching;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreathFirstSearchTest {
    @Test
    void breadthFirstSearchTest() {

        List<Integer> expectedResult = new LinkedList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(6);

        BreathFirstSearch.Node root = new BreathFirstSearch.Node(1);
        BreathFirstSearch.Node second = new BreathFirstSearch.Node(2);
        BreathFirstSearch.Node third = new BreathFirstSearch.Node(3);
        BreathFirstSearch.Node fourth = new BreathFirstSearch.Node(4);
        BreathFirstSearch.Node fifth = new BreathFirstSearch.Node(5);
        BreathFirstSearch.Node sixth = new BreathFirstSearch.Node(6);

        root.left = second;
        root.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;

        List<Integer> actualResult = BreathFirstSearch.breadthFirstSearch(root);

        assertEquals(expectedResult, actualResult);
    }

}