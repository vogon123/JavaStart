package Level2.ConditionsAndLoops;

import java.util.Scanner;

public class DigitsPrinter {
    static void printDigits(int n) {
        if (n < 0) {
            System.out.print(" - ");
            n *= -1;
        }

        int divider = 10;
        while (n / divider > 10) {
            divider *= 10;
        }


        while (divider > 0) {
            System.out.print(n / divider % 10 + " ");
            divider /= 10;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer number: ");
        int n = sc.nextInt();
        printDigits(n);
    }
}
