package Level1.Loops;

import java.util.Scanner;

public class PrimeChecker {
    static boolean isPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Error! A number should be positive!");
        }
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }
        return i == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The number " + n + " is " + (isPrime(n) ? "" : "not ") + "prime.");
    }
}
