/**
 * 08 - PalindromeString
 * Checks if a string is a palindrome, ignoring case and non-letters/digits.
 * E.g. "A man, a plan, a canal: Panama" counts as a palindrome.
 *
 * Concepts: two pointers, Character filters, case normalization.
 *
 * Run:
 *   javac PalindromeString.java
 *   java PalindromeString
 *
 * Sample I/O:
 *   Enter text: Madam
 *   "Madam" is a palindrome.
 */
import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        System.out.println("\"" + s + "\"" + (isPalindrome(s) ? " is a palindrome." : " is not a palindrome."));

        sc.close();
    }
}
