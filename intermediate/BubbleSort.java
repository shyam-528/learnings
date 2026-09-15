/**
 * 04 - BubbleSort
 * Sorts an array with bubble sort, stopping early if already sorted.
 *
 * Concepts: nested loops, swapping, early-exit flag, O(n^2) sorting.
 *
 * Run:
 *   javac BubbleSort.java
 *   java BubbleSort
 *
 * Sample I/O:
 *   How many elements? 5
 *   Enter 5 numbers: 5 1 4 2 8
 *   Sorted: 1 2 4 5 8
 */
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // already sorted
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        sc.close();
    }
}
