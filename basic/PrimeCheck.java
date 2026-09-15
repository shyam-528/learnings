/**
 * 09 - PrimeCheck
 * Checks whether a number is prime (only divisible by 1 and itself).
 * Optimized: tests divisors only up to sqrt(n).
 *
 * Concepts: loops, sqrt optimization, edge cases (n < 2).
 *
 * Run:
 *   javac PrimeCheck.java
 *   java PrimeCheck
 *
 * Sample I/O:
 *   Enter a number: 29
 *   29 is prime.
 */
import java.util.Scanner;

public class PrimeCheck {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(n + (isPrime(n) ? " is prime." : " is not prime."));

        sc.close();
    }
}
