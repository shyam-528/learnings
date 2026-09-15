/**
 * 13 - MultiplicationTable
 * Prints the multiplication table of a number from 1 to 10.
 *
 * Concepts: for loop, formatted printing with printf.
 *
 * Run:
 *   javac MultiplicationTable.java
 *   java MultiplicationTable
 *
 * Sample I/O:
 *   Enter a number: 7
 *   7 x 1 = 7
 *   7 x 2 = 14
 *   ...
 *   7 x 10 = 70
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }

        sc.close();
    }
}
