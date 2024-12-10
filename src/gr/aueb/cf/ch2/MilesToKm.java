package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert Miles to Km.
 */

public class MilesToKm {
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.6;
        double inputMiles = 0.0;
        double kilometers = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert Miles:");
        inputMiles = scanner.nextDouble();

        kilometers = inputMiles * KM_PER_MILE;

        System.out.println("Miles: " + inputMiles + " Kilometers: " + kilometers);
    }
}
