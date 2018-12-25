package Level1.Conditions;

import java.util.Scanner;

public class LuckyTicket {
    static boolean isLuckyTicket(int ticket) {
        if (ticket < 0) {
            throw new IllegalArgumentException("Error! Ticket number should be more than 0!");
        } else if (ticket > 999999) {
            throw new IllegalArgumentException("Error! Ticket number should be less than 999999!");
        }

        int rightPartSum = 0;
        for (int i = 0; i < 3; i++) {
            rightPartSum += ticket % 10;
            ticket /= 10;
        }

        int leftPartSum = 0;
        for (int i = 0; i < 3; i++) {
            leftPartSum += ticket % 10;
            ticket /= 10;
        }

        return leftPartSum == rightPartSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ticket number: ");
        int ticket = sc.nextInt();

        System.out.println("Your ticket is " + (isLuckyTicket(ticket) ? "" : "not ") + "lucky!");
    }
}
