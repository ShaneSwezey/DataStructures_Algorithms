package Searching;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreathFirstSearch {


    public static class Node {
        public int data;
        public Node left, right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
        public Node(int data, Node left, Node right) {
            this.data = data;
            this.right = right;
            this.left = left;
        }
    }

    /*
    Breath First Search Algorithm -- Binary Tree Version
    Time Complexity:
        Worst Case - O(n)
    Space Complexity:
        Space - O(n)
     */
    public static List<Integer> breadthFirstSearch(Node root) {
        Queue<Node> adjList = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        adjList.add(root);
        while (!adjList.isEmpty()) {
            int queSize = adjList.size();
            for (int i = 0; i < queSize; i++) {
                Node current = adjList.remove();
                result.add(current.data);
                if (current.left != null) adjList.add(current.left);
                if (current.right != null) adjList.add(current.right);
            }
        }
        return result;
    }

}