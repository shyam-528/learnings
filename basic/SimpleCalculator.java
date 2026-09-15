/**
 * 15 - SimpleCalculator
 * A menu-driven calculator: add, subtract, multiply, divide.
 * Loops until the user chooses Exit; guards against division by zero.
 *
 * Concepts: while loop, switch, methods, input validation.
 *
 * Run:
 *   javac SimpleCalculator.java
 *   java SimpleCalculator
 *
 * Sample I/O:
 *   1:Add 2:Subtract 3:Multiply 4:Divide 5:Exit
 *   Choice: 1
 *   Enter two numbers: 10 4
 *   Result = 14.0
 */
import java.util.Scanner;

public class SimpleCalculator {

    static double add(double a, double b)      { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }

    static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1:Add 2:Subtract 3:Multiply 4:Divide 5:Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice, try again.");
                continue;
            }

            System.out.print("Enter two numbers: ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            try {
                double result;
                switch (choice) {
                    case 1:  result = add(x, y);      break;
                    case 2:  result = subtract(x, y); break;
                    case 3:  result = multiply(x, y); break;
                    default: result = divide(x, y);   break;
                }
                System.out.println("Result = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
