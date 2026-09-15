/**
 * 14 - VowelOrConsonant
 * Checks whether an entered alphabet character is a vowel or a consonant.
 *
 * Concepts: char input, Character methods, switch statement, toLowerCase.
 *
 * Run:
 *   javac VowelOrConsonant.java
 *   java VowelOrConsonant
 *
 * Sample I/O:
 *   Enter a letter: E
 *   E is a vowel.
 */
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is not a letter.");
        } else {
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
        }

        sc.close();
    }
}
