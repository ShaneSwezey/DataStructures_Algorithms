package Searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void binarySearchIterativeFoundPosition() {

        // testArray sorted: {21,25,44,101,201,544,765,876,999}
        int[] testArray = {101,25,876,44,21,201,544,765,999};
        int searchValue = 21;
        int valuePosition = 0;

        int position = BinarySearch.binarySearchIterative(testArray, searchValue);

        // expected, actual
        assertEquals(valuePosition, position);

    }

    @Test
    void binarySearchIterativeNotFound() {

        // testArray sorted: {21,25,44,101,201,544,765,876,999}
        int[] testArray = {101,25,876,44,21,201,544,765,999};
        int searchValue = 55;
        int valuePosition = -1;

        int position = BinarySearch.binarySearchIterative(testArray, searchValue);

        // expected, actual
        assertEquals(valuePosition, position);
    }


    @Test
    void binarySearchRecursiveFoundPosition() {

        // testArray sorted: {21,25,44,101,201,544,765,876,999}
        int[] testArray = {101,25,876,44,21,201,544,765,999};
        int searchValue = 44;
        int valuePosition = 2;

        int position = BinarySearch.binarySearchRecursive(testArray, searchValue);

        // expected, actual
        assertEquals(valuePosition, position);
    }

    @Test
    void binarySearchRecursiveNotFound() {

        int[] testArray = {101, 25, 876, 44, 21, 201, 544, 765, 999};
        int searchValue = 5;
        int valuePosition = -1;

        int position = BinarySearch.binarySearchRecursive(testArray, searchValue);

        // expected, actual
        assertEquals(valuePosition, position);
    }


}