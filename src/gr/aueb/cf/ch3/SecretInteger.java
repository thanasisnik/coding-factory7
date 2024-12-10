package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Find the secret integer with only one try.
 */

public class SecretInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET){
            System.out.println("Secret Found!!!");
        }
        else {
            System.out.println("Sorry secret doesnt found");
        }
    }


}
