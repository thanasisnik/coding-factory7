package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το α^β.
 */

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;

        System.out.println("Please give the number: ");
        base = in.nextInt();

        System.out.println("Please give the power: ");
        power = in.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }
        System.out.println("The result is: " +result);
    }
}
