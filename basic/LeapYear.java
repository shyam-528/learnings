/**
 * 06 - LeapYear
 * Checks whether a year is a leap year.
 * Rule: divisible by 400, OR divisible by 4 but not by 100.
 *
 * Concepts: boolean logic, modulo, methods.
 *
 * Run:
 *   javac LeapYear.java
 *   java LeapYear
 *
 * Sample I/O:
 *   Enter a year: 2024
 *   2024 is a leap year.
 */
import java.util.Scanner;

public class LeapYear {

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
