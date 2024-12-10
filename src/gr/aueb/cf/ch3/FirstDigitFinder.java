package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Find the first left digit of a number.
 */

public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;
        int lastDigit = 0;

        System.out.println("Enter a positive number: ");
        inputNum = in.nextInt();
        tempNum = inputNum;

        while (tempNum >= 10){
            tempNum /= 10;
            lastDigit = tempNum;
        }
        System.out.println("Last digit of " +inputNum+ " is " +lastDigit );
    }
}
