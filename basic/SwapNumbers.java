/**
 * 05 - SwapNumbers
 * Swaps two numbers: first with a temp variable, then without one.
 *
 * Concepts: variables, assignment, arithmetic swap trick.
 *
 * Run:
 *   javac SwapNumbers.java
 *   java SwapNumbers
 *
 * Sample I/O:
 *   Enter two numbers: 5 9
 *   Before swap: a = 5, b = 9
 *   After swap (with temp): a = 9, b = 5
 *   After swap (no temp): a = 5, b = 9
 */
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Method 1: using a temporary variable.
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (with temp): a = " + a + ", b = " + b);

        // Method 2: without temp (arithmetic trick).
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap (no temp): a = " + a + ", b = " + b);

        sc.close();
    }
}
