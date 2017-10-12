package Sorting;

public class SelectionSort {

    /*
    Selection Sort Algorithm
    Time complexity:
        Worst Case - O(n^2)
    Space complexity:
        Space - O(1)
     */
    public static void selectionSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array parameter can't be null");
        }

        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }
}
