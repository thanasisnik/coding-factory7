package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

public class CharlnApp {
    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character ");

        ch = scanner.nextLine().charAt(0);

        System.out.printf("%c", ch);
    }
}
