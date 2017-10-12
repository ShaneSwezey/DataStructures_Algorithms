package DataStructures;

public class DSLinkedList<T> {

    private Node head;
    private int size;

    // DSLinkedList Constructor
    public DSLinkedList() {
        head = null;
        size = 0;
    }

    // Adds new node to the list with parameter element
    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Removes all occurrences of parameter element
    public void remove(T data) {
        Node current = head;
        if (current.data.equals(data)) {
            head = current.next;
        }
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
            }
            if (current.next == null) {
                break;
            }
            current = current.next;
        }
    }

    @Override
    // Returns a string of the current representation of the DSLinkedList
    public String toString() {
        StringBuilder factory = new StringBuilder();
        Node current = head;
        while (current != null) {

            factory.append("[" + current.data + "] ");
            current = current.next;
        }
        return factory.toString();
    }

    /*
    Returns an int that represents the amount of nodes contained currently
    in the DSLinkedList
    */
    public int size() {
        return size;
    }

    // Node in the DSLinkedList
    private class Node<E> {

        private E data;
        private Node next;

        // Node constructor
        private Node(E data) {
            this.data = data;
            next = null;
        }

    }
}


