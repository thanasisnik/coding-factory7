package gr.aueb.cf.ch4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Switch case fall through and can be used
 */
public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        int grade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a grade: ");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("VERY GOOD");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
