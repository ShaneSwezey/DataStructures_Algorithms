package Sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    void mergeSortEvenElements() {

        int[] testArray = {5,2,4,6,1,3};
        int[] sortedArray = {1,2,3,4,5,6};

        System.out.println("Test array before merge sort: " + Arrays.toString(testArray));

        MergeSort.mergeSort(testArray);

        System.out.println("Test array after merge sort : " + Arrays.toString(testArray));
        System.out.println("Expected array after sort   : " + Arrays.toString(sortedArray));

        // expected, actual
        assertArrayEquals(sortedArray,testArray);
        System.out.println();
    }

    @Test
    void mergeSortOddElements() {

        int[] testArray = {5,2,4,1,3};
        int[] sortedArray = {1,2,3,4,5};

        System.out.println("Test array before merge sort: " + Arrays.toString(testArray));

        MergeSort.mergeSort(testArray);

        System.out.println("Test array after merge sort : " + Arrays.toString(testArray));
        System.out.println("Expected array after sort   : " + Arrays.toString(sortedArray));

        // expected, actual
        assertArrayEquals(sortedArray,testArray);
        System.out.println();
    }

}