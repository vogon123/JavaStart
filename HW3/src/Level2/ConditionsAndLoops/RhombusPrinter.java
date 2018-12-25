package Level2.ConditionsAndLoops;

import java.util.Scanner;

public class RhombusPrinter {
    static void printRhombus(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("Error! The size should be more than 0!");
        }
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Error! The size should be an odd number!");
        }

        for (int i = 0, leftSideIndex = size / 2, rightSideIndex = size / 2, step = 1;
             i < size;
             i++, leftSideIndex -= step, rightSideIndex += step) {

            for (int j = 0; j < size; j++) {
                if (j == leftSideIndex || j == rightSideIndex) {
                    System.out.print("*\t");
                } else {
                    System.out.print(".\t");
                }
            }
            System.out.println();

            if (i == size / 2) {
                step = -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of a rhombus: ");
        int rhombusSize = sc.nextInt();

        printRhombus(rhombusSize);
    }
}
