package Level1.Loops;

import java.util.Scanner;

public class PalindromeChecker {
    static boolean isPalindrome(String s) {
        int length = s.length();
        int i;
        for (i = 0; i < length / 2; ++i) {
            if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(length - i - 1)) {
                break;
            }
        }
        return i >= length / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("The word '" + word.toLowerCase() + "' is " + (isPalindrome(word) ? "" : "not ") + "a palindrome.");
    }
}
