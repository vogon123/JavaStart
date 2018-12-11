//CelsiusToFahrenheitConverter

package com.gmail.igorvogon;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        double celsius = 0.0; // Input: any valid Celsius temperature

        double fahrenheit = celsius * 9 / 5 + 32; // Tf = Tc * 9 / 5 + 32;

        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
    }
}
