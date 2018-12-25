package Level1.Loops;

import java.util.Scanner;

public class EvensRangePrinter {
    static void printEvensRange(int first, int last) {
        for (int i = first % 2 == 0 ? first : first + 1; i <= last; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first and last elements of a range: ");
        int first = sc.nextInt();
        int last = sc.nextInt();

        printEvensRange(first, last);
    }
}
