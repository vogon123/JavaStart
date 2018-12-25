package Level2.ConditionsAndLoops;

import java.util.Scanner;

public class EquilateralTrianglePrinter {
    static void printEquilateralTriangle(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("Error! The size should be more than 0!");
        }

        for (int i = 0, triangleSymbols = 1; i < size; i++, triangleSymbols += 2) {
            int whiteSpaces = size - triangleSymbols / 2 - 1;

            for (int k = 0; k < whiteSpaces; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < triangleSymbols; k++) {
                System.out.print("^");
            }
            for (int k = 0; k < whiteSpaces; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of a triangle: ");
        int triangleSize = sc.nextInt();

        printEquilateralTriangle(triangleSize);
    }
}
