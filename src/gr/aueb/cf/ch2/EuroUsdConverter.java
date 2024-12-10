package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * This Programm return the value of euro to usd
 */

public class EuroUsdConverter {

    public static void main(String[] args) {

        int euro = 0;
        int totalCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Dose to poso se Euro:");
        euro = in.nextInt();

        totalCents = euro * PARITY;
        usaCents = totalCents % 100;
        usaDollars = totalCents /100;


        System.out.printf("Ta %d euro einai %d dollas, %d usa cents", euro , usaDollars, usaCents );
    }
}
