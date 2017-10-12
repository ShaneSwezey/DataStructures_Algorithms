package DataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DSLinkedListTest {
    @Test
    void addHeadTest() {

        DSLinkedList<Integer> list = new DSLinkedList<>();
        list.add(50);

        String expected = "[50] ";
        String actual = list.toString();

        assertEquals(expected, actual);

    }

    @Test
    void addTest() {

        DSLinkedList<Double> list = new DSLinkedList<>();
        list.add(50.0);
        list.add(25.0);
        list.add(15.0);

        String expected = "[50.0] [25.0] [15.0] ";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    void removeHeadTest() {

        DSLinkedList<String> list = new DSLinkedList<>();
        list.add("Add");
        list.add("Remove");
        list.remove("Add");

        String expected = "[Remove] ";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    void removeMidNodeTest() {

        DSLinkedList<Integer> list = new DSLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(3);

        String expected = "[1] [2] [4] ";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    void removeDuplicateNodeTest() {

        DSLinkedList<Double> list = new DSLinkedList<>();
        list.add(50.0);
        list.add(78.0);
        list.add(50.0);
        list.add(25.0);
        list.add(50.0);

        list.remove(50.0);

        String expected = "[78.0] [25.0] ";
        String actual = list.toString();

        assertEquals(expected, actual);

    }

    @Test
    void removeLastNodeTest() {

        DSLinkedList<Character> list = new DSLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');

        list.remove('c');

        String expected = "[a] [b] ";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    void sizeTest() {
        DSLinkedList<Integer> list = new DSLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int expectedSize = 3;
        int actualSize = list.size();

        assertEquals(expectedSize, actualSize);
    }

}