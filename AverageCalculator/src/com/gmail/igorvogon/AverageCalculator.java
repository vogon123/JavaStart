package com.gmail.igorvogon;

public class AverageCalculator {
    public static void main(String[] args) {
        int a = 5; // Input: any positive number
        int b = 9; // Input: any positive number

        int avg = a / 2 + b / 2 + (a % 2 + b % 2) / 2; // Your formula

        System.out.println("avg = " + avg);
    }

}
