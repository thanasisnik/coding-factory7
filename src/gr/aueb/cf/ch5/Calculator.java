package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ενα μενού επιλογών (Πρόσθεση, αφαίρεση, ...) .
 * Ο χρήστης επιλέγει.
 * Ανάλογα με την  επιλογή εκτελείται η αντίστοιχη πράξη.
 * Και εκτυπώνεται το αποτέλεσμα.
 * Εκτελείται επαναληπτικά μέχρι ο χρήστης να επιλέξει
 * Έξοδος.
 */
public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        int result = 0;

        while (true){
            printMenu();
            choice = getOneInt();

            if(!isChoiceValid(choice)){
                System.out.println("Error. Choice must be between 1-6. Try again.");
                continue;
            }

            if (choice == 6){
                System.out.println("Έξοδος...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu(){
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6 Έξοδος");
    }

    public static int getOneInt(){
        return scanner.nextInt();
    }


    public static boolean isChoiceValid(int choice){
        return choice >=1 && choice <= 6;

    }

    public static int getResultOnChoice(int choice){
        System.out.println("Please insert 2 integers");
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice){
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
                break;
            default:
                System.out.println("Error on choice");
                break;
        }
        return result;
    }

    public static int add(int a, int b){
        return  a + b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }

    public static int mod(int a, int b){
        return a % b;
    }

}
