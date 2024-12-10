package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * take input from user a 2 digit integer and returns the sum of the digits
 */

public class DigitsSum {
    public static void main(String[] args) {

        int num = 0;
        int d1 = 0;
        int d2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Give a 2 digit integer");
        num = in.nextInt();
        d1 = num / 10 ;
        d2 = num % 10;
        sum = d1 + d2;
        System.out.printf("Sum is %d" , sum);

    }
}
