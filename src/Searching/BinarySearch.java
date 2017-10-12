package Searching;

import java.util.Arrays;

public class BinarySearch {

    /*
    Binary Search Algorithm -- Iterative Version
    Time Complexity:
        Worst Case - O(log(n))
    Space Complexity:
        Space - O(1)
     */
    public static int binarySearchIterative(int[] array, int searchValue) {

        Arrays.sort(array);

        int leftStart = 0;
        int rightEnd = array.length - 1;
        int mid;

        while (leftStart <= rightEnd) {

            mid = (leftStart + rightEnd) / 2;

            if (searchValue == array[mid]) {
                return mid;
            }

            if (searchValue < array[mid]) {
                rightEnd = mid - 1;
            } else {
                leftStart = mid + 1;
            }

        }
        return -1;
    }

    /*
    Binary Search Algorithm -- Recursive Version
        Helper Method
     */
    public static int binarySearchRecursive(int[] array, int searchValue) {
        Arrays.sort(array);
        return binarySearchRecursive(array, searchValue,0, array.length - 1);
    }

    /*
    Binary Search Algorithm -- Recursive Version
    Time Complexity:
        Worst Case - O(log(n))
    Space Complexity:
        Space - proportional to the number of comparisons to maintain the recursive stack
     */
    private static int binarySearchRecursive(int[] array, int searchValue ,int leftStart, int rightEnd) {
        if (leftStart > rightEnd) {
            return -1;
        }

        int mid = (leftStart + rightEnd) / 2;

        if (searchValue == array[mid]) {
            return mid;
        } else if (searchValue < array[mid]) {
            return binarySearchRecursive(array, searchValue, leftStart, mid - 1);
        } else {
         return binarySearchRecursive(array, searchValue, mid + 1, rightEnd);
        }
    }

}
