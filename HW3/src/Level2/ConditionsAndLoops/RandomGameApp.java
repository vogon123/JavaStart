package Level2.ConditionsAndLoops;

import java.util.Random;
import java.util.Scanner;

public class RandomGameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int min = 1;
        int max = 100;

        final int answer = r.nextInt(max) + min;

        int i;
        for (i = 0; i < 5; i++) {
            System.out.print("Input number (" + min + ".." + max + "): ");
            int guess = sc.nextInt();
            if (guess == answer) {
                break;
            } else if (guess < answer) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }

        if (i >= 5) {
            System.out.println("Sorry, you lose. Random number was " + answer + ".");
        } else {
            System.out.println("YOU WIN!!! Random number was " + answer + ".");
        }
    }
}
