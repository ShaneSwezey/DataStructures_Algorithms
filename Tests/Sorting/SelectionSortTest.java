package Sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    void selectionSort() {

        int[] testArray = {25,22,24,26,21,23};
        int[] sortedArray = {21,22,23,24,25,26};

        System.out.println("Test array before selection sort: " + Arrays.toString(testArray));

        SelectionSort.selectionSort(testArray);

        System.out.println("Test array after selection sort : " + Arrays.toString(testArray));
        System.out.println("Expected array after sort       : " + Arrays.toString(sortedArray));

        // expected, actual
        assertArrayEquals(sortedArray,testArray);

    }

    @Test
    void selectionSortIllegalArgumentExceptionThrow() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           int[] testArray = null;
           SelectionSort.selectionSort(testArray);
        });
    }

}