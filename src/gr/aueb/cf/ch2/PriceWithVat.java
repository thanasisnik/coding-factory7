package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with VAT.
 */

public class PriceWithVat {
    public static void main(String[] args) {
        final double VAT = 0.24;
        Scanner scanner = new Scanner(System.in);
        double price = 0;

        System.out.println("Please insert the price: ");
        price = scanner.nextDouble();
        price += price * VAT;

        System.out.println("Price with VAT is: " +price);
    }
}
