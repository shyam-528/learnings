/**
 * 15 - ExceptionHandling
 * Demonstrates try-catch-finally, multiple catch blocks, and a custom
 * checked exception (AgeRestrictionException) for voting eligibility.
 *
 * Concepts: try/catch/finally, exception order, throw, custom exceptions.
 *
 * Run:
 *   javac ExceptionHandling.java
 *   java ExceptionHandling
 *
 * Sample I/O:
 *   Enter age: 15
 *   Cannot vote: must be 18 or older (got 15).
 *   Cleanup done (finally always runs).
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/** Custom checked exception for the voting-age rule. */
class AgeRestrictionException extends Exception {
    AgeRestrictionException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    static void checkVotingAge(int age) throws AgeRestrictionException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        if (age < 18) {
            throw new AgeRestrictionException("must be 18 or older (got " + age + ").");
        }
        System.out.println("Eligible to vote!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demo 1: division with multiple catch blocks.
        try {
            System.out.print("Divide 10 by: ");
            int d = sc.nextInt();
            System.out.println("10 / " + d + " = " + (10 / d));
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter a whole number.");
            sc.nextLine(); // clear bad input
        } finally {
            System.out.println("(Division attempt finished.)");
        }

        // Demo 2: custom checked exception.
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            checkVotingAge(age);
        } catch (AgeRestrictionException e) {
            System.out.println("Cannot vote: " + e.getMessage());
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Invalid age input: " + e.getMessage());
        } finally {
            System.out.println("Cleanup done (finally always runs).");
            sc.close();
        }
    }
}
