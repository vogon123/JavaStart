package Level2.ConditionsAndLoops;

import java.util.Scanner;

public class SubstringsCounter {
    static int countSubstrings(String s, String substring) {
        int count = 0;
        for (int i = 0; i <= s.length() - substring.length(); i++) {
            int j;
            for (j = 0; j < substring.length(); j++) {
                if (s.toLowerCase().charAt(i + j) != substring.toLowerCase().charAt(j)) {
                    break;
                }
            }
            if (j == substring.length()) {
                ++count;
                i += j - 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string and substring:");
        String mainString = sc.nextLine();
        String subString = sc.nextLine();

        System.out.println("The main string contains " + countSubstrings(mainString, subString) + " entered substring(s).");
    }
}
