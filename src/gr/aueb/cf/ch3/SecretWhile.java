package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isSuccess = false;
        final int SECRET = 12;

        do {
            System.out.println("Insert a num to guess the secret");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Secret Found!!!");
                isSuccess = true;
            } else {
                System.out.println("Try again!");
            }
        } while (!isSuccess);
    }
}
