package Sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

class InsertionSortTest {
    @Test
    void insertionSort() {

        int[] testArray = {5,2,4,6,1,3};
        int[] sortedArray = {1,2,3,4,5,6};

        System.out.println("Test array before insertion sort: " + Arrays.toString(testArray));

        InsertionSort.insertionSort(testArray);

        System.out.println("Test array after insertion sort : " + Arrays.toString(testArray));
        System.out.println("Expected array after sort       : " + Arrays.toString(sortedArray));

        // expected, actual
        assertArrayEquals(sortedArray,testArray);
    }

    @Test
    void insertionSortIllegalArgumentExceptionThrow() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int[] testArray = null;
            InsertionSort.insertionSort(testArray);
        });
    }


}