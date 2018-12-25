package Level1.Loops;

import java.util.Scanner;

public class CharsCounter {
    static int countChars(String s, char ch) {
        int charCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                ++charCount;
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text:");
        String str = sc.nextLine();

        System.out.print("Enter a symbol: ");
        char ch = sc.next().charAt(0);

        int charNumberInString = countChars(str, ch);
        System.out.println("There " + (charNumberInString > 1 ? "are " : "is ")
                + charNumberInString + " '" + ch + "' in entered line.");
    }
}
