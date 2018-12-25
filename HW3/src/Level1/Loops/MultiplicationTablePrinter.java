package Level1.Loops;

import java.util.Scanner;

public class MultiplicationTablePrinter {
    static void printMultiplicationTable(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("Error! The size should be more than 0!");
        }
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size * i; j += i) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of multiplication table: ");
        int size = sc.nextInt();

        printMultiplicationTable(size);
    }
}
