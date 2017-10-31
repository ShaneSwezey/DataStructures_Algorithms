package DataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DSStackTest {

    @Test
    void sizeEqualToZero() {
        DSStack stack = new DSStack();
        int expected = 0;
        int actual = stack.getSize();
        assertEquals(expected, actual);
    }

    @Test
    void sizeEqualOne() {
        DSStack stack = new DSStack();
        stack.push(1);
        int expected = 1;
        int actual = stack.getSize();
        assertEquals(expected, actual);
    }


    @Test
    void isEmpty() {
        DSStack stack = new DSStack();
        boolean expected = true;
        boolean actual = stack.isEmpty();
        assertEquals(expected, actual);
    }

}