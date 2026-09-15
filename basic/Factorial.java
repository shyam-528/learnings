/**
 * 07 - Factorial
 * Computes n! iteratively (and shows the long-overflow limit).
 *
 * Concepts: for loop, accumulator pattern, long vs int.
 *
 * Run:
 *   javac Factorial.java
 *   java Factorial
 *
 * Sample I/O:
 *   Enter n: 5
 *   5! = 120
 */
import java.util.Scanner;

public class Factorial {

    static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (n > 20) {
            System.out.println("Too big for long (overflows after 20!). Try n <= 20.");
        } else {
            System.out.println(n + "! = " + factorial(n));
        }

        sc.close();
    }
}
