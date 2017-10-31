package DataStructures;

/*
    Stack data structure implementation using a doubly linked list.
 */
public class DSStack {

    private Node top;
    private int size;

    public DSStack() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            top.previous = newNode;
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public Node pop() {
        if (top == null) {
            return null;
        }
        Node out = top;
        top = top.next;
        top.previous = null;
        out.next = null;
        return out;
    }

    public Node peek() {
        if (top == null) {
            return null;
        }
        return top;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }


    private class Node {
        int data;
        Node next, previous;

        public Node(int data) {
            this.data = data;
            next = null;
            previous = null;
        }

    }

}
