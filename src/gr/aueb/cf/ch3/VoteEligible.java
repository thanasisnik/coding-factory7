package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα να ψηφίσουν έχουν όσοι είναι πάνω απο 18.
 */

public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        final int AGE_ELIGIBLE = 18;
        boolean isEligible = false;

        System.out.println("Insert your age: ");
        age = scanner.nextInt();

        isEligible = age >= AGE_ELIGIBLE;
        System.out.printf("User is eligible? %b", isEligible);
    }
}
