package Level1.Loops;

import java.util.Random;
import java.util.Scanner;

public class RandomsPrinter {
    static void printRandoms(int count, int min, int max) {
        if (count < 1) {
            throw new IllegalArgumentException("Error! Count should be more than 0!");
        }
        if (min > max) {
            throw new IllegalArgumentException("Error! Min should be less or equal than max!");
        }

        Random r = new Random();
        for (int i = 0; i < count; i++) {
            System.out.print(r.nextInt(max - min + 1) + min + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter count, min and max numbers: ");
        int count = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();

        printRandoms(count, min, max);
    }
}
