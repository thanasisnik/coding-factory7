package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Take a temperature from user and
 * shows the result
 */

public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBellowZero;

        System.out.println("Please insert the current temperature");

        temp = in.nextInt();

        isTempBellowZero = temp < 0;

        System.out.println("The temperature is bellow zero : " +isTempBellowZero);
    }
}
