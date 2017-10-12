package Sorting;

public class InsertionSort {

    /*
   Insertion Sort Algorithm
   Time Complexity:
       Worst Case - O(n^2)
   Space Complexity:
       Space - O(1)
    */
    public static void insertionSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array parameter can't be null");
        }
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
