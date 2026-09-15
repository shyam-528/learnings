/**
 * 02 - AddTwoNumbers
 * Reads two integers from the user and prints their sum.
 *
 * Concepts: Scanner, nextInt, arithmetic, formatted output.
 *
 * Run:
 *   javac AddTwoNumbers.java
 *   java AddTwoNumbers
 *
 * Sample I/O:
 *   Enter first number: 12
 *   Enter second number: 8
 *   Sum = 20
 */
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
