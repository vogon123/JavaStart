package Level1.Loops;

import java.util.Scanner;

public class SumApp {
    static int clientElementsSum() {
        System.out.println("Enter 0 to exit or another number to add:");

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int n = sc.nextInt(); n != 0; n = sc.nextInt()) {
            sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of entered numbers is " + clientElementsSum() + ".");
    }
}
