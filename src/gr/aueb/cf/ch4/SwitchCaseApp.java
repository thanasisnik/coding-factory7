package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of switch / case.
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chose on of number: ");
            System.out.println("1 One player gamer");
            System.out.println("2 Two player gamer");
            System.out.println("3 Team player gamer");
            System.out.println("4 Quit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("One player");
                    break;
                case 2:
                    System.out.println("Two player");
                    break;
                case 3:
                    System.out.println("Team player");
                    break;
                case 4:
                    System.out.println("Quiting..");
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }

        }while (choice != 4);
    }
}
