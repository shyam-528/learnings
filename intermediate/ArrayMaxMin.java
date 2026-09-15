/**
 * 01 - ArrayMaxMin
 * Finds the maximum and minimum values in an array in a single pass.
 *
 * Concepts: arrays, for-each loop, single-pass min/max.
 *
 * Run:
 *   javac ArrayMaxMin.java
 *   java ArrayMaxMin
 *
 * Sample I/O:
 *   How many elements? 5
 *   Enter 5 numbers: 3 9 1 7 4
 *   Max = 9, Min = 1
 */
import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements? ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array must have at least one element.");
            sc.close();
            return;
        }

        System.out.print("Enter " + n + " numbers: ");
        int first = sc.nextInt();
        int max = first, min = first;
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (x > max) max = x;
            if (x < min) min = x;
        }

        System.out.println("Max = " + max + ", Min = " + min);
        sc.close();
    }
}
