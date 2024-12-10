package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please Insert a Num and dedominator");
                num = in.nextInt();
                if (num == 0) break;

                denominator = in.nextInt();
                result = num / denominator;
                System.out.printf("%d / %d = %d", num, denominator, result);
            } catch (ArithmeticException e) {
                System.out.println("Error.Denominator must not be zero.");
            }
        }
        System.out.println("Thanks for using the app.");
    }
}
