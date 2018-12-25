package Level1.Loops;

import java.util.Scanner;

public class RangePrinter {
    static void printRange(int first, int last) {
        int step = first > last ? -1 : 1;
        for (int i = first; i != last; i += step) {
            System.out.print(i + " ");
        }
        System.out.println(last);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first and last elements of a range: ");
        int first = sc.nextInt();
        int last = sc.nextInt();

        printRange(first, last);
    }
}
