/**
 * 02 - ReverseArray
 * Reverses an array in place using the two-pointer technique.
 *
 * Concepts: arrays, two pointers, in-place swap, helper print method.
 *
 * Run:
 *   javac ReverseArray.java
 *   java ReverseArray
 *
 * Sample I/O:
 *   How many elements? 5
 *   Enter 5 numbers: 1 2 3 4 5
 *   Reversed: 5 4 3 2 1
 */
import java.util.Scanner;

public class ReverseArray {

    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? " " : "\n"));
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

        reverse(arr);
        System.out.print("Reversed: ");
        print(arr);

        sc.close();
    }
}
