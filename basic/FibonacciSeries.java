/**
 * 08 - FibonacciSeries
 * Prints the first n terms of the Fibonacci series: 0 1 1 2 3 5 8 ...
 *
 * Concepts: loops, two-variable iteration, edge cases (n = 0, 1).
 *
 * Run:
 *   javac FibonacciSeries.java
 *   java FibonacciSeries
 *
 * Sample I/O:
 *   How many terms? 8
 *   0 1 1 2 3 5 8 13
 */
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many terms? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive count.");
        } else {
            long a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + (i < n - 1 ? " " : "\n"));
                long next = a + b;
                a = b;
                b = next;
            }
        }

        sc.close();
    }
}
