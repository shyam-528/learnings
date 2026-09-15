/**
 * 04 - LargestOfThree
 * Finds the largest of three numbers using if-else-if.
 *
 * Concepts: relational operators, logical operators, if-else-if ladder.
 *
 * Run:
 *   javac LargestOfThree.java
 *   java LargestOfThree
 *
 * Sample I/O:
 *   Enter three numbers: 12 45 30
 *   Largest = 45
 */
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest = " + largest);

        sc.close();
    }
}
