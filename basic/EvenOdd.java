/**
 * 03 - EvenOdd
 * Checks whether a number is even or odd using the % operator.
 *
 * Concepts: if-else, modulo operator, methods.
 *
 * Run:
 *   javac EvenOdd.java
 *   java EvenOdd
 *
 * Sample I/O:
 *   Enter a number: 7
 *   7 is odd.
 */
import java.util.Scanner;

public class EvenOdd {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }

        sc.close();
    }
}
