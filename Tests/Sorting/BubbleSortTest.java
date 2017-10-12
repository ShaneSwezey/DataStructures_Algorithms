package Sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void bubbleSort() {

        int[] testArray = {15,12,14,16,11,13};
        int[] sortedArray = {11,12,13,14,15,16};

        System.out.println("Test array before bubble sort: " + Arrays.toString(testArray));

        BubbleSort.bubbleSort(testArray);

        System.out.println("Test array after bubble sort : " + Arrays.toString(testArray));
        System.out.println("Expected array after sort    : " + Arrays.toString(sortedArray));

        // expected, actual
        assertArrayEquals(sortedArray,testArray);
    }


    @Test
    void bubbleSortIllegalArgumentExceptionThrow() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int[] testArray = null;
            BubbleSort.bubbleSort(testArray);
        });
    }


}