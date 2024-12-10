package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Προσθέτει όλους τους άρτιους.
 */

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 2;
        int result = 0;

        System.out.println("Give the inputNum: ");
        inputNum = in.nextInt();

        while (i <= inputNum) {
            result += i;
            i += 2;
        }
        System.out.println("Result is: " +result);
    }
}

