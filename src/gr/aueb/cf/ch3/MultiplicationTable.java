package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
* Δίνει ως εξοδο τον πολλαπλασιασμο ενος ακεραίου
 * που δίνει ο χρήστης με όλους τους ακεραίους απο 1 εως 10.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Enter an integer: ");
        num = scanner.nextInt();

        while (i <= 10){
            System.out.println("Multiplication of " + num + " * " + i + " = " + (num * i) );
            i++;
        }
    }
}
