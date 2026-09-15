/**
 * 05 - LinearSearch
 * Searches an array element by element; reports index or "not found".
 *
 * Concepts: linear scan, early return, -1 sentinel, O(n) search.
 *
 * Run:
 *   javac LinearSearch.java
 *   java LinearSearch
 *
 * Sample I/O:
 *   Array: 4 2 7 1 9
 *   Search for: 7
 *   Found at index 2.
 */
import java.util.Scanner;

public class LinearSearch {

    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};
        Scanner sc = new Scanner(System.in);

        System.out.print("Array: ");
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
