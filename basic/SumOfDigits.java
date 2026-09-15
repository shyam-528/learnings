/**
 * 12 - SumOfDigits
 * Adds up all digits of a number (e.g. 123 -> 6). Also counts the digits.
 *
 * Concepts: while loop, digit extraction, multiple accumulators.
 *
 * Run:
 *   javac SumOfDigits.java
 *   java SumOfDigits
 *
 * Sample I/O:
 *   Enter a number: 4825
 *   Sum of digits = 19
 *   Digit count = 4
 */
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        // Special case: the number 0 has one digit with sum 0.
        if (temp == 0) {
            System.out.println("Sum of digits = 0");
            System.out.println("Digit count = 1");
        } else {
            int sum = 0, count = 0;
            while (temp > 0) {
                sum += temp % 10;
                count++;
                temp /= 10;
            }
            System.out.println("Sum of digits = " + sum);
            System.out.println("Digit count = " + count);
        }

        sc.close();
    }
}
