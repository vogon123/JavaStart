package Level1.Conditions;

import java.util.Scanner;

public class BiggerRectangle {
    static int biggerRectangle(int width1, int height1, int width2, int height2) {
        if (width1 < 1 || width2 < 1 || height1 < 1 || height2 < 1) {
            throw new IllegalArgumentException("Error! Entered not positive number!");
        }

        return width1 * height1 > width2 * height2 ? 1 : 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width and height of two rectangles: ");

        int w1 = sc.nextInt();
        int h1 = sc.nextInt();

        int w2 = sc.nextInt();
        int h2 = sc.nextInt();

        System.out.println("The bigger rectangle is #" + biggerRectangle(w1, h1, w2, h2) + ".");
    }
}
