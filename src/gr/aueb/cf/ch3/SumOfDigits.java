package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of digits of an integer.
 */

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        int tempnum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer: ");
        num = in.nextInt();
        tempnum = num;

        while ( tempnum > 0){
            rightDigit = tempnum % 10;
            sum += rightDigit;
            tempnum /= 10;
        }

        System.out.println("Sum is: " +sum);

    }
}
