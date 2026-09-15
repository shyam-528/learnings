/**
 * 06 - BinarySearch
 * Searches a SORTED array by halving the range each step: O(log n).
 *
 * Concepts: divide and conquer, loop invariants, sorted-input requirement.
 *
 * Run:
 *   javac BinarySearch.java
 *   java BinarySearch
 *
 * Sample I/O:
 *   Sorted array: 1 3 5 7 9 11
 *   Search for: 7
 *   Found at index 3.
 */
import java.util.Scanner;

public class BinarySearch {

    static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // avoids overflow
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        Scanner sc = new Scanner(System.in);

        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.print("\nSearch for: ");
        int key = sc.nextInt();

        int index = search(arr, key);
        if (index == -1) {
            System.out.println(key + " not found.");
        } else {
            System.out.println("Found at index " + index + ".");
        }

        sc.close();
    }
}
