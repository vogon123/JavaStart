package Level1.Conditions;

import java.util.Scanner;

public class DaysOfMonth {
    static int daysOfMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Error! Entered incorrect month!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        System.out.println("There are " + daysOfMonth(month) + " days in month #" + month + ".");
    }
}
