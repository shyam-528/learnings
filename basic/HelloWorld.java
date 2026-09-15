/**
 * 01 - HelloWorld
 * Your very first Java program: printing to the console.
 *
 * Concepts: class, main method, System.out.println, command-line args.
 *
 * Run:
 *   javac HelloWorld.java
 *   java HelloWorld
 *
 * Sample output:
 *   Hello, World!
 *   Welcome to Java learnings!
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java learnings!");

        // Greet a name passed as a command-line argument, if any.
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        }
    }
}
