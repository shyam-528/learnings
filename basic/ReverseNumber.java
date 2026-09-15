/**
 * 11 - ReverseNumber
 * Reverses the digits of a number, preserving the sign.
 *
 * Concepts: while loop, modulo/division, negative handling.
 *
 * Run:
 *   javac ReverseNumber.java
 *   java ReverseNumber
 *
 * Sample I/O:
 *   Enter a number: -1234
 *   Reversed = -4321
 */
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sign = (n < 0) ? -1 : 1;
        int temp = Math.abs(n);
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Reversed = " + (sign * rev));

        sc.close();
    }
}
