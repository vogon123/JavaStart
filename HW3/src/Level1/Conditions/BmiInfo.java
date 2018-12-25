package Level1.Conditions;

import java.util.Scanner;

public class BmiInfo {
    static String bmiInfo(double weight, double height) {
        if (!(weight > 0 && height > 0)) {
            throw new IllegalArgumentException("Error! Entered wrong weight or(and) height!");
        }

        double bmi = weight / Math.pow(height, 2.0);

        return bmi <= 18.5 ? "Underweight" : bmi <= 25.0 ? "Normal" : "Overweight";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight and height: ");
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.println("Your result is " + bmiInfo(weight, height));
    }
}
