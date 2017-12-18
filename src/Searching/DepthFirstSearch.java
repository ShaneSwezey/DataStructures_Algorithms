package Searching;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {


    public class Node {
        public int data;
        public Node left, right;
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    /*
    Depth First Search -- Binary Tree Version
    Time Complexity:
        Worst Case - O(n)
    Space Complexity:
        Space - O(n)
     */
    public static List<Integer> depthFirstSearch(Node root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Stack<Node> nodeList = new Stack<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            Node current = nodeList.pop();
            result.add(current.data);
            if (current.right != null) nodeList.push(current.right);
            if (current.left != null) nodeList.push(current.left);
        }
        return result;
    }

}
