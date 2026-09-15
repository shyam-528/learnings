/**
 * 03 - SecondLargest
 * Finds the second largest distinct element in one pass.
 *
 * Concepts: single-pass tracking of top two, distinct-value handling.
 *
 * Run:
 *   javac SecondLargest.java
 *   java SecondLargest
 *
 * Sample I/O:
 *   How many elements? 6
 *   Enter 6 numbers: 5 9 9 3 7 1
 *   Second largest = 7
 */
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements? ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Need at least 2 elements.");
            sc.close();
            return;
        }

        System.out.print("Enter " + n + " numbers: ");
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x < largest) {
                second = x;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest (all elements equal).");
        } else {
            System.out.println("Second largest = " + second);
        }

        sc.close();
    }
}
