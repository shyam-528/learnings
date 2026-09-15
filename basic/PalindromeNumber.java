/**
 * 10 - PalindromeNumber
 * Checks whether a number reads the same forwards and backwards (e.g. 121).
 *
 * Concepts: while loop, digit extraction (%, /), number reversal.
 *
 * Run:
 *   javac PalindromeNumber.java
 *   java PalindromeNumber
 *
 * Sample I/O:
 *   Enter a number: 121
 *   121 is a palindrome.
 */
import java.util.Scanner;

public class PalindromeNumber {

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Negative numbers are not palindromes.");
        } else {
            System.out.println(n + (n == reverse(n) ? " is a palindrome." : " is not a palindrome."));
        }

        sc.close();
    }
}
