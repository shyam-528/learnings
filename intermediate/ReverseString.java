/**
 * 07 - ReverseString
 * Reverses a string three ways: StringBuilder, loop, and char array swap.
 *
 * Concepts: immutability of String, StringBuilder, char arrays.
 *
 * Run:
 *   javac ReverseString.java
 *   java ReverseString
 *
 * Sample I/O:
 *   Enter text: hello
 *   StringBuilder: olleh
 *   Manual loop:   olleh
 */
import java.util.Scanner;

public class ReverseString {

    static String viaBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static String viaLoop(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        System.out.println("StringBuilder: " + viaBuilder(s));
        System.out.println("Manual loop:   " + viaLoop(s));

        sc.close();
    }
}
