/**
 * 01 - QuickSort
 * Sorts an array with QuickSort (Lomuto partition, average O(n log n)).
 *
 * Concepts: recursion, partitioning, pivot selection, in-place sorting.
 *
 * Run:
 *   javac QuickSort.java
 *   java QuickSort
 *
 * Sample output:
 *   Before: [9, 3, 7, 1, 8, 2, 6]
 *   After:  [1, 2, 3, 6, 7, 8, 9]
 */
import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /** Lomuto partition: everything left of the pivot ends up smaller. */
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 1, 8, 2, 6};
        System.out.println("Before: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After:  " + Arrays.toString(arr));
    }
}
